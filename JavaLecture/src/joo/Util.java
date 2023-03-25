package joo;

import java.util.Scanner;

public class  Util {

	
	
	public static String getKeyBoardValue(String str)
	{
		
		Scanner scanner = new Scanner(System.in); //입력을 받기 위한 스캐너 객체를 생성
		
		System.out.print(str);
		String input = scanner.nextLine(); //키보드로부터 값을 입력 받아 input 변수에 저장한다.
		
		return input;

	}
	
	
	
	public static int getKeyBoardValueInt(String str)
	{
		return Integer.parseInt(getKeyBoardValue(str)); 
	}
	
	public static void getRandom()
	{
		
		
		System.out.println(Math.random());
	}
}
