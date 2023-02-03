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
			System.out.println("원판 "+n+"를 "+from+"에서 "+to+"으로 옮긴다.");
			a(n-1,tmp,from,to);
		}
			
			
		
	}
}

class test{
	
	void first()
	{
		second();
	}
	
	void second()
	{
		System.out.println("second 호출!");
	}
}
class Monster
{
	int distance;
}


class Marine
{
	int hp;
	static int  shootingRange=6;
	
	void attack(Monster target)
	{
		if(shootingRange <target.distance)
			move();
	}
	
	void move()
	{
		
	}
	
	void showState()
	{
		System.out.println("체력: "+hp+"\t 사정거리:"+shootingRange);
	}
	
	static void test()
	{
		System.out.println("클래스 메서드 호출!");
	}
}




public class Main {
	
	public static void main(String[] args) {
		
	MyTest t1= new MyTest();
	
	Point pt = t1.getPoint();
	
	System.out.println(pt);
	
	}
	


}
