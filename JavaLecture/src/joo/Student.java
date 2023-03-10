package joo;

public class Student
{
	public String name ;
	int kor ;
	int eng ;
	int math ;
	static int count;
	
	{
		count++;
	}
	
	public Student()
	{ 
		
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