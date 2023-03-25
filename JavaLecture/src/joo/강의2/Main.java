package joo.강의2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		실습문제2_4();
		
	}
	

	
	
	public static void 실습문제1_1()
	{
		final double PI = 3.14;
		float radius = 1.5f;
		
		System.out.println(2*radius*PI);
		
	}
	
	public static void 실습문제1_2()
	{
		int a= 1000000;
		int b=2000000;
		long c= (long)a*b;
		
		System.out.println(c);
		
	}
	
	public static void 실습문제1_3()
	{
		char a = '3';
		
		int b = a-'0';
		
		System.out.println(b);
		
	}
	
	
	public static void 실습문제1_4()
	{
		char ch;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("값을 입력하세요");
		String input = scanner.nextLine();
		
		ch = input.charAt(0);// 문자열에서 첫글자를 char 형태로 가져온다.
		
		System.out.println(ch>='A' && ch<='Z');
		
	}
	
	
	public static void 실습문제1_5()
	{
		int people = 65;
		int carPassenger = 4;
		
		System.out.println((people /carPassenger) + (people%carPassenger > 0 ? 1:0));
	}
	
	
	public static void 실습문제2_1()
	{
		int num = 4567;
		System.out.println(num/100*100);
	}
	
	public static void 실습문제2_2()
	{
		int num = 30;
		System.out.println(num %2 ==0 ? "짝수":"홀수");
	}
	
	public static void 실습문제2_3()
	{
		char ch;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("값을 입력하세요");
		String input = scanner.nextLine();
		
		ch = input.charAt(0);
		
		System.out.println(ch>='A' && ch<='Z' ? (char)(ch+('a'-'A')):ch);
		
	}

	
	public static void 실습문제2_4()
	{
		int f = 100;
		
		float c = (int)(5f/9* ( f-32)*10+0.5)/10f;
		
		System.out.println("화씨 :" + f);
		System.out.println("섭씨 :" + c);
		
	}
}
