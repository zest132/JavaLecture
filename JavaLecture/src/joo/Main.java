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

class HanoiTower
{
	void a(int n, char from ,char tmp, char to)
	{
		if(n==1) 
			System.out.println("원판 1을 "+from + "에서 " + to +"으로 옮긴다.");
		else
		{
			a(n-1,from,to,tmp);
			System.out.println("원판"+n+"를 "+from+"에서"+to+"으로 옮긴다.");
			a(n-1,tmp,from,to);
		}
			
			
		
	}
}


public class Main {

	public static void main(String[] args) {
		
		HanoiTower t1 = new HanoiTower();
		
	
		t1.a(4,'A','B','C');

		
	
	  
	}

}
