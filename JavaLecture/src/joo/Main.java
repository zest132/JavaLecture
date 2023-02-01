package joo;

import java.util.Arrays;
import java.util.Scanner;





class Tv
{
	//데이터(멤버변수)
	String color;
	boolean power = false;
	int channel =0;
	
	String state;
	//기능(메서드)
	void TurnOn()
	{
		if(state.equals("고장"))
			return;
		
		power = true;
		
	}
	
	
	
	void TurnOff()
	{
		power = false;
	}
	void ChannelUp()
	{
		channel++;
	}
	void ChannelDown()
	{
		channel--;
	}	
	
	
	
}


class Test1
{

	
	int a()
	{
		System.out.println("메서드 a 호출");
		int result = b(); 
		 
		return result;
	}
	
	int b()
	{
		System.out.println("메서드 b 호출");
		return 0;
	}
	
	


}

class Test2
{
	int c()
	{
		return 0;
	}
	
	int d()
	{
		return 0;
	}
}



class Test
{
	
	int factorial(int n)
	{
		//입력값 필터링
		if(n >=13 || n<0)
			return 1;
			
		if(n ==1)
			return 1;
		
		return n*factorial(n-1);
	}
}

public class Main {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		//!5 를 계산한다.
		int result = t1.factorial(5);
		
	    System.out.println(result);
	}

}
