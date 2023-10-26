package joo.강의8;

public class Bird {

	int age;
	
	
	Bird()
	{
		age = 1;
	}
	
	Bird(int age)
	{
		this.age =age;
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
