package joo.강의7;

import java.util.Calendar;

public class Person
{
	String name;
	String RRN;
	
	int money;
	
	void send(Person p1)
	{
		//매개변수로 넘어온 객체의 금액을 내가 가진 금액만큼 증가 시킨다. 
		p1.money+=money;
		//나의 돈은 0원으로 만든다.
		money=0;
	}
	
	void showState()
	{
		System.out.println("이름:"+ name + "\t주민번호:"+ RRN +"\t 성별: " + getGender() + "\t"+"나이:"+getAge());
	}
	
	String getGender()
	{
		
		String gender = RRN.substring(7,8);
		
		switch(gender)
		{
			case "1","3","5","7","9":
				gender = "남";
				break;
				
			default:
			gender = "여";
				break;
		}
		
		
		
		if(gender.equals("1")
			||gender.equals("3")
			||gender.equals("5")
			||gender.equals("7")
			||gender.equals("9"))
			gender = "남";
		else
			gender = "여";
		
		
		
	return gender;
	}
	
	
	
	
	int getAge()
	{
		//현재 년원일을 가져오기 위한 객체 생성
		Calendar cal = Calendar.getInstance();
		
		//현재의 년월일을 변수에 저장한다.
		int nowYear = cal.get(Calendar.YEAR);
		int nowMonth = cal.get(Calendar.MONTH)+1;
		int nowDay =  cal.get(Calendar.DAY_OF_MONTH);
		
		//년도 뒷자리 2개를 가져온다.
		int year = Integer.parseInt(RRN.substring(0,2));
		
		//성별을 가져온다. 성별의 숫자에 따라 태어난 년도가 결정되기에 필요하다.
		String generation = RRN.substring(7,8);
		//성별의 숫자를 통해 어느세대인지 구분하여 태어난 년도를 만든다.
		switch(generation)
		{
			case "0","9":
				year +=1800;
				break;
			case "1","2","5","6":
				year +=1900;
				break;
			case "3","4","7","8":
				year +=2000;
				break;
		}
		//주민번호에서 년월일을 가져온다.
		int bornMonth = Integer.parseInt(RRN.substring(2,4));
		int bornDay = Integer.parseInt(RRN.substring(4,6));
		//만나이를 계산한다. 생일이 지났는지 여부에 따라 1살을 더할지 말지 결정된다.
		int bornYear = nowYear - year-(nowMonth>= bornMonth && nowDay>= bornDay ? 0 : 1);
		return bornYear;
	}
}
