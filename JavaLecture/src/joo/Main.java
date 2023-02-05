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



public class Main {
	
	public static void main(String[] args) {

		/*
		Student student1 = new Student();
		
		Student student2 = new Student("박주병");
		
		Student student3 = new Student("홍길동",32,13,23);

		System.out.println(Student.count);

		*/
		
		System.out.println("마린5 이 저글링2을 공격하였습니다.");
		System.out.println("마린1 이 저글링3을 공격하였습니다.");
		System.out.println("저글링3이 죽었습니다.");
		System.out.println("마린팀 공격턴 종료");
		System.out.println("저글링2 이 마린5을 공격하였습니다.");
		System.out.println("마린5이 죽었습니다.");
		System.out.println("저글링팀 공격턴 종료");
		System.out.println("마린1 이 저글링2을 공격하였습니다.");
		System.out.println("저글링2이 죽었습니다.");
		System.out.println("마린팀 승리 ! 남은 유닛 1개");
		
	}
	


}
