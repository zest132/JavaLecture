package joo;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	/*
	char ch;
	Scanner scanner = new Scanner(System.in); //입력을 받기 위한 스캐너 객체를 생성
	
	System.out.println("성적을 입력하세요:");
	String input = scanner.nextLine(); //키보드로부터 값을 입력 받아 input 변수에 저장한다.
	
	int score = Integer.parseInt(input); // string 타입의 변수를 int로 변경한다.
	

	if(score>=60) 
		System.out.println("합격입니다.");
	
	if(score<60) 
		System.out.println("불합격입니다.");

	*/
		
		문제9();
		
	}
	

	
	public static void 문제9()
	{
		int x = 2;
		int y = 7;
		char c = 'A'; 
		System.out.println(1 + x < 3);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(y >= 7 || x > 0 && x <= 3);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('8'-'0');
		System.out.println(x);
	}
	
	public static  void 문제10()
	{
		char ch = '3';
		
		boolean result = (ch-'0') >=0 && ('9'-ch) <=9; 
		
		System.out.println(result);
	}
}
