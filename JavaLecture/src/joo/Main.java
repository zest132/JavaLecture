package joo;

import joo.ten.Time;



class Parent
{
	

	int intTest;
	static int intTestStatic;
	
	int intTestOver;
	static int intTestStaticOver;
	
	
	
	
	String stringTest;
	static String stringTestStatic;
	
	void test()
	{
		intTest=10;
		intTestStatic=11;
		intTestOver = 12;
		intTestStaticOver = 13;
		
		stringTest = "stringTest";
		stringTestStatic = "stringTestStatic";
		
	}
	
	void thisTest()
	{
		System.out.println(this);
	}
	
	
}

class Child extends Parent
{
	
	/*
	 * 1.변수
	 * 2.static 변수
	 * 3.변수 오버라이딩 
	 * 4.static 변수 오버라이딩
	 *  
	 *  자식의 메서드에서
	 *  그냥 접근
	 *  this 접근
	 *  super 접근
	 * 
	 *  상속받은 메서드 그대로 사용
	 *   그냥 접근
	 *   this 접근
	 *   super는 부모의 메서드이니 없다.
	 * 
	 */
	//int intTest;
	//static int intTestStatic;
	
	//String stringTest;
	//static String stringTestStatic;
	
	
	int intTestOver;
	static int intTestStaticOver;
	
	Child()
	{
		intTest = 20;
		intTestStatic = 21;
		intTestOver = 22;
		intTestStaticOver = 23;
	}
	void childtest()
	{
		System.out.println("-------변수--------");
		System.out.println(intTest);
		System.out.println(this.intTest);
		System.out.println(super.intTest);
		System.out.println(System.identityHashCode(intTest));
		System.out.println(System.identityHashCode(this.intTest));
		System.out.println(System.identityHashCode(super.intTest));
		System.out.println("-------static--------");
		System.out.println(intTestStatic);
		System.out.println(this.intTestStatic);
		System.out.println(super.intTestStatic);
		System.out.println(System.identityHashCode(intTestStatic));
		System.out.println(System.identityHashCode(this.intTestStatic));
		System.out.println(System.identityHashCode(super.intTestStatic));

		System.out.println("-------오버라이드 변수--------");
		System.out.println(intTestOver);
		System.out.println(this.intTestOver);
		System.out.println(super.intTestOver);
		System.out.println(System.identityHashCode(intTestOver));
		System.out.println(System.identityHashCode(this.intTestOver));
		System.out.println(System.identityHashCode(super.intTestOver));
		
		System.out.println("-------오버라이드 static--------");
		System.out.println(intTestStaticOver);
		System.out.println(this.intTestStaticOver);
		System.out.println(super.intTestStaticOver);
		System.out.println(System.identityHashCode(intTestStaticOver));
		System.out.println(System.identityHashCode(this.intTestStaticOver));
		System.out.println(System.identityHashCode(super.intTestStaticOver));
		
		
	}
	
	void superTest()
	{
		System.out.println(super.toString());
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
