package joo.강의9;

import java.awt.Point;


class Shape 
{
	Point p;
	
	Shape() 
	{
		this(new Point(0,0));
	}
	
	Shape(Point p) 
	{
		this.p = p;
	}
	
	// 도형의 면적을 계산해서 반환하는 메서드
	double calcArea()
	{
		return 1;
	}
	
	Point getPosition() 
	{
		return p;
	}
	
	void setPosition(Point p) 
	{
		this.p = p;
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




public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		

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
}
