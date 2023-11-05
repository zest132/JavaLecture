package joo.강의12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import joo.강의11.RPG.BlackSmith;
import joo.강의11.RPG.Punch;
import joo.강의11.RPG.Weapon;





public class Main {
	
	

	
	
	public static void main(String[] args) {
	
		
		실습문제1_1();
		
		
		

		
	}
	
	public static void myExceptionTest() throws MyException
	{
		throw new MyException("내가만든 예외");
	}
	
	
	public static void 실습문제1_1()
	{
		try
		{
			int[] list = new int[5];
			
			for(int i=0 ;i<=5;i++)
				list[i] = i;
			
			
			System.out.println(list);
		}catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 넘었습니다.");
		}
	
			
	}
	
	public static void 실습문제1_2()
	{
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; 
		int count = 0; // 시도횟수
		
		do {
			count++;
			System.out.print("1 ~ 100 사이의 값을 입력하세요 :"); 

			try 
			{
				input = new Scanner(System.in).nextInt();
			} 
			catch(java.util.InputMismatchException e) 
			{
				System.out.println("비정상적인 값입니다. 다시입력하세요"); 
				continue;
			}
			
			if(answer > input) 
				System.out.println("더 큰 수를 입력하세요"); 
			else if(answer < input)
				System.out.println("더 작은 수를 입력하세요"); 

			
		} while(answer!=input); // 답을 맞출때 까지 무한반복
		System.out.println("정답입니다."); 
		System.out.println(count+"번 만에 맞췄습니다."); 
	}
	
	public static void 실습문제1_3()
	{
		try
		{
			test(false);
			test(true);
			
		}catch (Exception e) {
			System.out.println(7);
		}
	}
	
	
	
	public static void 실습문제2_1()
	{
		MyMath m = new MyMath();
		
		m.add(10, 0);
	}
	
	public static void 실습문제2_2() 
	{
		try
		{
			MyMath m = new MyMath();
			
			m.minus(10, 0);
		}
		catch(MyMath.CanNotMinusZeroException ex1)
		{
			
		}
		catch(Exception ex)
		{
			
		}
		
		
		
	}
	
	public static void 실습문제2_3()
	{
		File file = new File("C:\\Users\\zest1\\git\\JavaLecture\\JavaLecture\\src\\joo\\twelve\\test.txt");
		
		
		FileReader fileReader=null;
		try
		{
			 fileReader = new FileReader(file);
			int fileContent=0;
			while((fileContent = fileReader.read()) != -1)
				System.out.print((char)fileContent);
			
			
		}catch(Exception ex)
		{
			
		}
		finally
		{
			try
			{
				if(fileReader !=null)
					fileReader.close();	
			}catch(IOException ex1)
			{
				
			}
			
		}
		
		
	}


	public static void test(boolean isThrowYn) throws Exception
	{
		try
		{
			System.out.print(1);
			if(isThrowYn) 
			{
				throw new NullPointerException();
			}
				
		
			System.out.print(2);
			
			
			throw new Exception();
			
		}catch(RuntimeException ex)
		{
			System.out.print(3);	
		}
		catch(Exception ex)
		{
			System.out.print(4);
		}
		finally
		{
			System.out.print(5);
		}
		
		System.out.print(6);
		
	}
	
	



}


