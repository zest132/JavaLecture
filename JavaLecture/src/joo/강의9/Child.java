package joo.강의9;

public class Child extends Parent{	
	int age;
	


	public Child(String name , int age)
	{
		super(name);
		this.age = age;
	}
	
	
	public String toString()
	{
		return  super.toString()+" 나이: " +age;
	}
	

	

}
