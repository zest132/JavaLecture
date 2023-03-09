package joo.eleven;

import joo.eleven.RPG.BlackSmith;
import joo.eleven.RPG.Gun;
import joo.eleven.RPG.Sword;
import joo.eleven.RPG.User;

public class 실습문제 {

	
	
	public void main1_3()
	{
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
	
	void main2_1()
	{
		User user1 = new User("랭킹1위가자",100,new Gun(10,5));
		
		User user2 = new User("똥겜망해라",70,new Sword(15,10));
		
		user1.attack(user2);
		user1.attack(user2);
		user1.attack(user2);
		user1.attack(user2);
		user1.attack(user2);
		user1.attack(user2);
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		
		
		BlackSmith bm = new BlackSmith();
		
		//유저1의 무기를 대장장이에게 맡긴다.
		bm.repaire(user1.Weapon);
		System.out.println(user1.toString());
		
		bm.repaire(user2.Weapon);
		System.out.println(user2.toString());
	}
}
