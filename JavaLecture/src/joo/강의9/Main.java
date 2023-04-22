package joo.강의9;



class Parent1
{
	int age =50;

}



class Child1 extends Parent1
{
	int age;
	
	Child1()
	{
		/*
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
		
		
		System.out.println(System.identityHashCode(age));
		System.out.println(System.identityHashCode(this.age));
		System.out.println(System.identityHashCode(super.age));*/

	}
}


public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parent1 parent = new Parent1();
		parent.age = 80;
		
		System.out.println(System.identityHashCode(parent.age));
		Child1 child = new Child1();
		
		System.out.println(System.identityHashCode(child.age));
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
		ElectricCar car = new ElectricCar();
		
		car.battery= 50;
		
		car.Charge(30);
		
		System.out.println("현재 배터리량:"+car.battery);
		
	}
}
