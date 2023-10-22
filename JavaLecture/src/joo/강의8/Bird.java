package joo.강의8;

public class Bird {

	int age;
	
	
	Bird()
	{
		age = 1;
	}
	
	Bird(int age)
	{
		this.age = 1;
	}
	
	
	void fly()
	{
		System.out.println(this);
	}
	
	
	void eat()
	{
		System.out.println("this: "+this);
	}
}
