package joo.강의9;

public class GrandParent {
	
	
	String name;
	int age;
	
	GrandParent getInstance()
	{
		return this;
	}
	
	
	void showState()
	{
		System.out.println("이름: " + name+" 나이: "+age);
	}
	
	static void print()
	{
		System.out.println("test");
	}
	

	

}
