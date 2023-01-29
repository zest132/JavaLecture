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
}

public class Main {

	
	static int add(int x, int y)
	{
		int result = x+y;
		return result;
	}

	public static void main(String[] args) {
		
		
		 add(15,20);
		
	}

}
