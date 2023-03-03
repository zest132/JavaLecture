package joo;

import joo.nine.Car;
import joo.nine.OilCar;






public class Main {
	
	public static void main(String[] args) {
		
		Car car = new OilCar();

		
		
		
		OilCar oilCar = (OilCar)car;
		Car newOilCar =  oilCar;
		OilCar test  = (OilCar)newOilCar;
	}
	


}
