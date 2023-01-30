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

class Archer
{
	
	String color;
	int power ;
	int hp =0;
	
	void Attack()
	{
		
	}
	
	 int add(int x, int y)
	{
		
		return x+y;
	}

	 void add(int x, int y,int z)
	{
			int result = x+y+z;
		
	}
	 
	 int compare(int a , int b)
	 {
		 if(a>b)
			 return a;
		 
		 
		return b;
		 
	 }
	
}

class MyMath
{
	 int add(int x, int y)
	{
		int result = x+y;
		return result;
	}
	 
	 int add(int x, int y , int z)
	 {
		 return x+y+z;
	 }
}
public class Main {

	public static void main(String[] args) {
		
		Tv myTv = new Tv();

		myTv.color = "BLACK";
		myTv.TurnOn();
		
		Tv[] tv = new Tv[3];
		
		tv[0] = new Tv();
		tv[1] = new Tv();
		tv[2] = new Tv();
		
		tv[0].color = "RED";
		tv[0].TurnOn();
		
		
		System.out.println(tv[0].color);
		
		
	}

}
