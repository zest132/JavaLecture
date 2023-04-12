package joo.강의7;

import java.awt.Point;
import java.util.Calendar;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	}
	
	
	public static void 실습문제1_1()
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "홍길동";
		p1.RRN = "750215-1234567";
		
		p2.name = "김길동";
		p2.RRN = "850215-1234567";
		
		p3.name = "박길동";
		p3.RRN = "040215-2234567";
		
		
		System.out.println("이름:"+ p1.name + "\t주민번호: "+ p1.RRN);
		System.out.println("이름:"+ p2.name + "\t주민번호: "+ p2.RRN);
		System.out.println("이름:"+ p2.name + "\t주민번호: "+ p2.RRN);
		
	}
	
	public static void 실습문제1_2()
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.RRN="950101-1234567";
		p2.RRN="950101-6789123";
		
		p1.showState();
		p2.showState();
	}
	
	
	public static void 실습문제1_3()
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.RRN="010512-3234567";
		p2.RRN="950101-2789123";
		
		p1.showState();
		p2.showState();
	}
	
	public static void 실습문제2_1()
	{
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		
		m1.showState();
		m2.showState();
		
	}
	
	public static void 실습문제2_2()
	{
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.powerUp();
		m1.armorUp();
		
		
		m1.showState();
		m2.showState();
	}
	
	public static void 실습문제2_3()
	{
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.attack(m2);
		
		
		m1.showState();
		m2.showState();
	}
	
	public static void 실습문제2_4()
	{
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.position = new Point(2,2);
		
		m2.position = new Point(7,7);
		
		m1.attack(m2);
	}
}




class Person
{
	String name = "홍길동";
	String RRN;
	
	
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
		
		/*
		if(gender.equals("1")
			||gender.equals("3")
			||gender.equals("5")
			||gender.equals("7")
			||gender.equals("9"))
			gender = "남";
		else
			gender = "여";
		*/
		
		
		return gender;
	}
	
	
	int getAge()
	{
		
		Calendar cal = Calendar.getInstance();
		
		int nowYear = cal.get(Calendar.YEAR);
		int nowMonth = cal.get(Calendar.MONTH)+1;
		int nowDay =  cal.get(Calendar.DAY_OF_MONTH);
		
		//년도 뒷자리 2개를 가져온다.
		int year = Integer.parseInt(RRN.substring(0,2));
		
		//성별을 가져온다. 성별의 숫자에 따라 태어난 년도가 결정되기에 필요하다.
		String generation = RRN.substring(7,8);
		
		
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
		
		int bornMonth = Integer.parseInt(RRN.substring(2,4));
		
		int bornDay = Integer.parseInt(RRN.substring(4,6));
		
		
		int bornYear = nowYear - year-(nowMonth>= bornMonth && nowDay>= bornDay ? 0 : 1);
		
		
		
		return bornYear;
	}
}







class Marine {
	int hp=40;
	static int power=4;
	static int armor=0;
	static int shootingRange=6;
	
	Point position;
	
	void showState()
	{
		System.out.println("체력: "+hp+"\t 공격력:"+power + "\t 방어력:"+armor);
	}

	

	double getDistance(Marine target)
	{
		//타깃과의 거리계산
		double result = Math.sqrt(
						  	Math.pow(target.position.x - position.x, 2)
						  + Math.pow(target.position.y - position.y, 2)
						);
		
		return result;
	}

	void attack(Marine target)
	{
		double distance = getDistance(target);
		
		if(distance >shootingRange)
		{
			System.out.println("공격이 닿지 않습니다. 타깃과의거리:"+distance);
			return;
		}
		
		target.hp -=(power-target.armor);
		
	}
	void powerUp()
	{
		power++;	
	}
	
	void armorUp()
	{
		armor ++;
	}
	
	
}
