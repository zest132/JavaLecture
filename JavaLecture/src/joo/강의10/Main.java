package joo.강의10;


public class Main {

	public static void main(String[] args) {
		

	}
	
	
	public static void 실습문제1_1()
	{
		//지금까지 개발한 클래스들 패키지 나누기
	}
	
	public static void 실습문제2_1()
	{
		//Car 클래스 추상클래스로 변경
		//new Car(); 불가능하다.
	}
	
	public static void 실습문제2_2()
	{
		People p1= new People("123456-1234567", "남자");
	}
	
	public void 실습문제2_3()
	{
		Marine marine = new Marine();
		Marine marine2 = new Marine();
		Zergling zergling = new Zergling();
		
		
		marine.attack(zergling);
		zergling.attack();
		
		System.out.println(marine.toString());
		marine.powerUp();
		System.out.println(marine2.toString());
		
		System.out.println(Unit.count);
		System.out.println(Marine.count);
		System.out.println(Zergling.count);
	}
	
	public static void 실습문제3_1()
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
	
	public static void 실습문제3_2()
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
