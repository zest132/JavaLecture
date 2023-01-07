package joo;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	/*
	char ch;
	Scanner scanner = new Scanner(System.in); //입력을 받기 위한 스캐너 객체를 생성
	
	System.out.println("값을 입력하세요:");
	String input = scanner.nextLine(); //키보드로부터 값을 입력 받아 input 변수에 저장한다.
	ch = input.charAt(0);  //input 변수의 타입을 char로 변경한다.
	*/
	
	int f = 100;
	float c = (int)(5f/9 * (f-32)*10+0.5)/10f;

	System.out.println("화씨 : "+f );
	System.out.println("섭씨 : "+c );

	}

}
