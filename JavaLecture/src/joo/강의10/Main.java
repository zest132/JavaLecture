package joo.강의10;



abstract class Animal
{
	abstract void go();
	
}


class Tiger extends Animal
{

	void go() 
	{
		System.out.println("기어간다");
		
	}
}

class Bird extends Animal
{

	void go() {

		System.out.println("날아간다");
	}
}




class Card
{
	public final int number  =10;  
}

public class Main {

	public static void main(String[] args) {
		

	}
	
	
	
	
	public static void 실습문제1_1()
	{
		//Galaxy,IPhone,Phone 클래스 참조
	}
	
	public static void 실습문제1_2()
	{
		//People 클래스 참조
	}
	
	public static void 실습문제1_3()
	{
		People[] list = new People[5];
		
		
		list[0]= new People("홍길동1",25,"000825-3456789" , "남자");
		list[1]= new People("홍길동2",30,"950825-1456789" , "남자");
		list[2]= new People("홍길동3",25,"000825-4456789" , "여자");
		list[3]= new People("홍길동4",25,"000825-2456789" , "여자");
		list[4]= new People("홍길동5",25,"000825-2456789" , "여자");
		
		for(People p : list)
		{
			System.out.println(p);
			
		}

		
	}
	
	
	
	public static void 실습문제2_1()
	{
		Time t = new Time();
		t.setHour(30);
		System.out.println(t.toString());
		
		t.setHour(20);
		System.out.println(t.toString());
		
		t.setMinute(-50);
		System.out.println(t.toString());
		
		t.setMinute(50);
		System.out.println(t.toString());
		
	}
	
	public static void 실습문제2_2()
	{
		serverConnection con = serverConnection.getInstance();
		serverConnection con1 = serverConnection.getInstance();
		serverConnection con2 = serverConnection.getInstance();
		serverConnection con3 = serverConnection.getInstance();
		
		//주소가 모두 동일하게 나온다.
		System.out.println(con);
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
		
		
		
	}
	

}
