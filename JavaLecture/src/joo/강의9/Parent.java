package joo.강의9;

public class Parent   extends GrandParent{
	
	
	String name = "부모";

	Parent getInstance()
	{
		return this;
	}
	
	
	
	Parent(String name)
	{
		this.name =name;
	}
	
	public String toString()
	{
	  return "이름: "+ name;
	}

	 
	

	
}
