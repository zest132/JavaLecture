package joo;

public class Child extends Parent{

	
	int age;
	
	Child()
	{
		
	}
	
	
	Child(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	public String toString()
	{
		return  super.toString()+" 나이: " +age;
	}
	

	

}
