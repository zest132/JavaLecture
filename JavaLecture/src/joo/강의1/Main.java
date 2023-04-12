package joo.강의1;

import joo.강의10.People;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	 char a = 110;
	 
	 System.out.println(a);
	 
	
		
	
		
	}
	
	public static void a()
	{
		
	}
	
	
	
	
	public static void 실습문제1_1()
	{
		System.out.println("안녕");
		System.out.println("Hello World!");
	}
	
	public static void 실습문제1_2()
	{
		System.out.println("안녕하세요");
	}
	
	public static void 실습문제2_1()
	{
		int age = 25;
		
		System.out.println("나이: "+age);
	}
	
	
	public static void 실습문제2_2()
	{
		int a = 10;
		int b = 50;
		
		int temp = a;
		a=b;
		b= temp;
		
		System.out.println("a의값: "+a+" b의값:"+b);
	}
	
	
	public static void 실습문제3_1()
	{
		boolean bool =true; //1바이트 
		short s = 13; // 2바이트
		byte by = 10; //1바이트
		float f = (float)3.15; //4 바이트
		char c = 'a'; // 2바이트
		long l = 13; //8바이트
		double d= 3.1348; //8바이트
		int i = 10; //4바이트
	}
	
	
	public static void 실습문제3_2()
	{
		//1번 클래스 파일명
	}
	
	public static void 실습문제3_3()
	{
		int radious = 13;
		final float PI = 3.14f;
		
		System.out.println(radious *2*PI);
		
		
		/*
		 *  변수타입 : int, float
			리터럴 : 13 , 3.14, 2
			변수명 : radious , PI
			상수키워드 :final
			연산자 : =, *
		 */
		
	}
	
	public static void 실습문제3_4()
	{
		//2, 4, 5, 6, 7, 8
	}
	
	public static void 실습문제3_5()
	{
		//2번 String
	}
	
	public static void 실습문제3_6()
	{
		/*
		char a = ' ';
		float f = 3.14;  //리터럴 소수는 기본이 double형이다 더 작은타입으로는 명시적으로 형변환해야한다.혹은 f를 붙인다.
		char name ="홍길동"; // char은 문자 1개만을 저장할수 있다. 
		double d = 5.81f;
		int I =3.14;  // 리터럴 소수는 double 이며 더 작은 타입인 int로는 명시적 형변환을 해야 한다.
		*/
	}
	
	

}
