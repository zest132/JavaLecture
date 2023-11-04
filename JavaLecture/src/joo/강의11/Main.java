package joo.강의11;

import joo.강의11.RPG.BlackSmith;
import joo.강의11.RPG.Gun;
import joo.강의11.RPG.Punch;
import joo.강의11.RPG.Repairable;
import joo.강의11.RPG.Sword;
import joo.강의11.RPG.User;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		실습문제1_6();
		
	}

	public static void 실습문제1_1()
	{

		ShoppingBasket basket = new ShoppingBasket();
	
		//장바구니에는 다형성에 의해 Item의 자식타입이면 어떤 객체든 들어간다.
		basket.itemList.add(new TV());
		basket.itemList.add(new Sofa());
		
	}
	
	public static void 실습문제1_2()
	{
		ShoppingBasket sb = new ShoppingBasket();
		

		sb.itemList.add(new TV(1, "삼성50인치", 0));
		sb.itemList.add(new Sofa(2, "푹신한쇼파", 23));
		sb.itemList.add(new Bicycle(3, "천리마 자전거", 100));
		
		for(Item item : sb.itemList)
		{
			System.out.println("바코드번호:"+item.barcodNumber
								+"물품명:"+item.name
								+"가격"+item.price
								);
		}
		
		
		
	}
	
	public static void 실습문제1_3()
	{
		ShoppingBasket sb = new ShoppingBasket();
		

		sb.itemList.add(new TV(1, "삼성50인치", 0));
		sb.itemList.add(new Sofa(2, "푹신한쇼파", 23));
		sb.itemList.add(new Bicycle(3, "천리마 자전거", 100));
		
		for(Item item : sb.itemList)
		{
			String result = item.toString();
			
			System.out.println(result);
		}
	}
	
	public static void 실습문제1_4()
	{
		ShoppingBasket shopping = new ShoppingBasket();
		
		shopping.itemList.add(new Sofa(1,"샤넬쇼파",25000));
		shopping.itemList.add(new Sofa(2,"푹신한쇼파",25000));
		shopping.itemList.add(new TV(3,"삼성 QLED",10000));
		shopping.itemList.add(new Bicycle(1,"빠른 자전거",5000));
		
		System.out.println(shopping.getInfoList());

	
		
				
			
	}
	
	public static void 실습문제1_5()
	{
		ShoppingBasket shopping = new ShoppingBasket();
		
		shopping.itemList.add(new Sofa(1,"샤넬쇼파",25000));
		shopping.itemList.add(new Sofa(2,"푹신한쇼파",25000));
		shopping.itemList.add(new TV(3,"삼성 QLED",10000));
		shopping.itemList.add(new Bicycle(1,"빠른 자전거",5000));
		
		System.out.println(shopping.getInfoList());

		System.out.println("합계: "+shopping.getTotalPrice());
		
				
			
	}
	
	public static void 실습문제1_6()
	{
		ShoppingBasket shopping = new ShoppingBasket();
		
		//itemList를 외부에서 직접 사용하지 못한다.
		//shopping.itemList.add(new Sofa(1,"샤넬쇼파",25000));
		//shopping.itemList.add(new Sofa(2,"푹신한쇼파",25000));
		//shopping.itemList.add(new TV(3,"삼성 QLED",10000));
		//shopping.itemList.add(new Bicycle(1,"빠른 자전거",5000));
		
		//필터링 기능이 있는 addItem을 사용한다.
		shopping.addItem(new Sofa(1,"샤넬쇼파",25000));
		shopping.addItem(new Sofa(2,"푹신한쇼파",25000));
		shopping.addItem(new TV(3,"삼성 QLED",10000));
		shopping.addItem(new Bicycle(1,"빠른 자전거",5000));

		System.out.println(shopping.getInfoList());

		System.out.println("합계: "+shopping.getTotalPrice());
		
				
			
	}
	
	
	static void 실습문제2_1()
	{
		//User 클래스는 Weapon 클래스를 포함한다.
		//Sword, Gun, Punch 클래스는 Weapon 클래스를 상속 받는다.
		//Sword, Gun 클래스는 Repairable 인터페이스를 구현한다.
	}
	
	static void 실습문제2_2()
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
	}
	
	static void 실습문제2_3()
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
	
	
	static void  실습문제2_4()
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
		bm.repaire((Repairable)user1.Weapon);

		System.out.println(user1.toString());
		
		bm.repaire((Repairable)user2.Weapon);
		System.out.println(user2.toString());
	}
}
