package joo;

import joo.ten.Time;



class Parent
{
	
	Parent(int a)
	{
		
	}
	
}

class Child extends Parent
{
	
	Child()
	{
		super(1);
	}

}



public class Main {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		
		Child child1 = new Child();
		
		Child child2 = new Child();
		
		parent.test();
		/*
		System.out.println("---부모의 변수 주소값-----");
		System.out.print("intTest : "+parent.intTest + "   주소값:");
		System.out.println(System.identityHashCode(parent.intTest));
		System.out.print("intTestStatic : "+parent.intTestStatic+"  주소값:");
		System.out.println(System.identityHashCode(parent.intTestStatic));
		
		System.out.print("intTestOver : "+parent.intTestOver + "   주소값:");
		System.out.println(System.identityHashCode(parent.intTestOver));
		System.out.print("intTestStaticOver : "+parent.intTestStaticOver+"  주소값:");
		System.out.println(System.identityHashCode(parent.intTestStaticOver));
*/
		parent.thisTest();
		
		child1.thisTest();
		child1.superTest();
		
		
		
	}
	


}
