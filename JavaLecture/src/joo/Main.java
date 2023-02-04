package joo;

import java.time.LocalDate;
import java.time.LocalTime;



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


class Factorial
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

class HanoiTower
{
	void a(int n, char from ,char tmp, char to)
	{
		if(n==1) 
			System.out.println("원판 1을 "+from + "에서 " + to +"으로 옮긴다.");
		else
		{
			a(n-1,from,to,tmp);
			System.out.println("원판 "+n+"를 "+from+"에서 "+to+"으로 옮긴다.");
			a(n-1,tmp,from,to);
		}
			
			
		
	}
}


class Monster
{
	int distance;
}

/*
class test
{
	int a = 10;
	static int b = 20;
	
	int c = b;
	//static int d = a;
	
	static void staticMethod()
	{
		//System.out.println(a);
		System.out.println(b);
	}
	
	void instanceMethod()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void staticMethod2()
	{
		staticMethod();
		//instanceMethod();
	}
	
	void instanceMethod2()
	{
		staticMethod();
		instanceMethod();
	}
}

*/

class test{
	int iv= 10;
	void a()
	{
		int iv =5;
		System.out.println(iv);
	}
}

public class Main {
	
	public static void main(String[] args) {
			
		
		test t1= new test();
		
		t1.a();
		
		
		
		
		
		
		
		
		
		
	}
	


}
