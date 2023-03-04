package joo;


import joo.eleven.Bicycle;
import joo.eleven.ShoppingBasket;
import joo.eleven.Sofa;
import joo.eleven.TV;



public class Main {
	
	public static void main(String[] args) {
		
		ShoppingBasket shopping = new ShoppingBasket();
		
/*
		shopping.itemList.add(new Sofa(1,"샤넬쇼파",25000));
		shopping.itemList.add(new Sofa(2,"푹신한쇼파",25000));
		shopping.itemList.add(new TV(3,"삼성 QLED",10000));
		shopping.itemList.add(new Bicycle(1,"빠른 자전거",5000));
		*/
		
		shopping.addItem(new Sofa(1,"샤넬쇼파",25000));
		shopping.addItem(new Sofa(2,"푹신한쇼파",25000));
		shopping.addItem(new TV(3,"삼성 QLED",10000));
		shopping.addItem(new Bicycle(1,"빠른 자전거",5000));
		
		System.out.println(shopping.getInfoList());
		
		
		System.out.println("합계: "+shopping.getTotalPrice());
		System.out.println("예상 적립 마일리지: "+shopping.getTotalMileage());
		
	
	
	}
}
