package joo.강의9;

import java.awt.Point;


class Shape 
{
	
	double getArea()
	{
		return 0;
	}
	

}

class Circle extends Shape
{
	double r;
	
	Circle(double r)
	{
		this.r = r;
	}
	
	@Override
	double getArea() {
		
		return Math.PI * r *r; 
	}
	
	
	@Override
	public boolean equals(Object obj) {
	
		return getArea() ==((Circle)obj).getArea();
	}
	
	
}

class Rectangle extends Shape
{
	double width;
	double height;
	
	Rectangle(double width , double height)
	{
		this.width = width ; 
		this.height = height;
	}
	
	
	@Override
	double getArea() {
		// 
		return width * height;
	}
	
	boolean isSquare()
	{
		return width==height;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	
		return getArea() ==((Rectangle)obj).getArea();
	}
}


class Parent1
{
	int age =50;

}



class Child1 extends Parent1
{
	int age;
	
	Child1()
	{
		
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
		
		
		System.out.println(System.identityHashCode(age));
		System.out.println(System.identityHashCode(this.age));
		System.out.println(System.identityHashCode(super.age));
		
		System.out.println(this);
		System.out.println(super.toString());

	}
}


class Product
{
	int price;
	
	Product(int price)
	{
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}


class test
{
	String name = new String("부모");
	
	int a=50;
	public void print()
	{
		System.out.println("부모:"+a+"  주소:"+System.identityHashCode(a));
		System.out.println("부모:"+name+"  주소:"+System.identityHashCode(name));
	}
}

class test2 extends test
{
	
	String name = new String("자식");
	int a=10;
	public void print()
	{
		super.a= 30;
		System.out.println("자식:"+super.a+"  주소:"+System.identityHashCode(super.a));
		System.out.println("자식:"+name+"  주소:"+System.identityHashCode(name));
		System.out.println("자식:"+this.name+"  주소:"+System.identityHashCode(this.name));
		System.out.println("자식:"+super.name+"  주소:"+System.identityHashCode(super.name));
	}
}

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		test parent = new test();
		
		test2 t3 = new test2();
		
		
		parent.print();
		
		t3.print();

		

	}

	
	public static void 실습문제1_1()
	{
		OilCar car = new OilCar();
		car.go(100);
		System.out.println(car.speed);
		car.stop();
		System.out.println(car.speed);
	}
	
	
	public static void 실습문제1_2()
	{
		
		
		OilCar car = new OilCar();
		
		car.doors[0].name = "운전석";
		car.doors[1].name = "조수석";
		car.doors[2].name = "운전석 뒷문";
		car.doors[3].name = "조수석 뒷문";
		
		car.doors[2].open();
		
		
		for(Door door : car.doors)
			if(door.isOpen)
				System.out.println(door.name+"이 열려있습니다.");	
			

	}
	
	public static void 실습문제1_3()
	{
		ElectricCar car = new ElectricCar();
		
		car.battery= 50;
		
		car.Charge(30);
		
		System.out.println("현재 배터리량:"+car.battery);
		
	}
	
	
	public static void 실습문제2_1()
	{
		
		/*
		 * 오버라이딩은 메서드가 반환타입까지 포함하여 완전히 일치해야한다
		 * 공변반환타입만 예외가 적용된다.
		 */
		
	}
	
	public static void 실습문제2_2()
	{
		
		/*TV의 부모인 Product의 기본 생성자가 없다. 
		 * 자식은 무조건 부모의 생성자를 호출하도록되어 있으며
		 * 자동 호출시 기본 생성자를 호출한다.
		 * 
		 */
	}
	
	public static void 실습문제2_3()
	{
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(15, 15);
		
		System.out.println("반지름 5의 원의 면적: "+circle.getArea());
		
		System.out.println("네모 면적:"+rectangle.getArea());
		
		if(rectangle.isSquare())
			System.out.println("정사각형 입니다.");
	}
	
	public static void 실습문제2_4()
	{
		Circle circle = new Circle(5);
		Circle circle2 = new Circle(5);
		System.out.println(circle.equals(circle2));
		
		
		Rectangle rectangle = new Rectangle(15, 15);
		Rectangle rectangle2 = new Rectangle(15, 15);
		System.out.println(rectangle.equals(rectangle2));
	
	}
}
