package joo;

import joo.nine.ElectricCar;
import joo.nine.HibrideCar;

public class Main {
	

	
	public static void main(String[] args) {
		
		
		ElectricCar car = new ElectricCar();
		HibrideCar  car2 = new HibrideCar();
		
		
		car.battery= 50;
		car.Charge(30);
		
		car2.battery = 20;
		car2.Charge(50);
		
		System.out.println("현재 배터리량:"+car.battery);
		System.out.println("현재 배터리량:"+car2.battery);

	
	}
	


}
