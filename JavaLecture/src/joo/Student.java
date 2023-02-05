package joo;

public class Student
{
	String name ;
	int kor ;
	int eng ;
	int math ;
	static int number;
	
	static { 
		System.out.println("클래스 초기화 블럭");
		
	}
	
	{
		System.out.println("인스턴스 초기화 블럭");
		number++;
	}
	
	Student()
	{ 
		System.out.println("생성자");
	}
	
	Student(String name)
	{
		this.name = name;
	}
	
	Student(String name, int kor, int eng,int math)
	{
		this.name =name;
		this.kor =kor;
		this.eng = eng;
		this.math=math;
	}
	
	

	

	
	int getTotal()
	{
		return kor+eng+math;
	}
	
	int getAverage()
	{
		return getTotal()/3;
	}
	
	
}