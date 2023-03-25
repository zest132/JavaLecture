package joo.강의11;

import joo.강의11.RPG.BlackSmith;
import joo.강의11.RPG.Gun;
import joo.강의11.RPG.Repairable;
import joo.강의11.RPG.Sword;
import joo.강의11.RPG.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void 실습문제1_1()
	{
		//클래스관의 관계를 설정하자.
		// ShoppingBasket 은 포함관계로 List<Item> list 멤버변수를 가진다.
		//TV, Sofa, Bicycle 은 Item을 상속 받는다.
	}
	
	public static void 실습문제1_2()
	{
		ShoppingBasket sb = new ShoppingBasket();
		
		//Item은 추상클래스
		
		TV tv = new TV(1, "삼성50인치", 0);
		Sofa sofa = new Sofa(2, "푹신한쇼파", 23);
		Bicycle biscycle = new Bicycle(3, "천리마 자전거", 100);
	}
	
	public static void 실습문제1_3()
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
