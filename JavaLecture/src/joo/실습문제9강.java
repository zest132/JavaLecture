package joo;

import joo.nine.Door;
import joo.nine.ElectricCar;
import joo.nine.OilCar;

public class 실습문제9강 {
	
	public void 문제1_2()
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
	
	
	public void 문제1_3()
	{
		ElectricCar car = new ElectricCar();
		
		car.battery= 50;
		
		car.Charge(30);
		
		System.out.println("현재 배터리량:"+car.battery);
		
		
		
	}
}
