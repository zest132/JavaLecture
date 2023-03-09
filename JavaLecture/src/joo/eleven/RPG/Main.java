package joo.eleven.RPG;

public class Main {

	
	void Main()
	{
		User user1 = new User("랭킹1위가자",100,new Gun(10,5));
		  
		  User user2 = new User("똥겜망해라",70,new Sword(15,10));
		  
		  user1.attack(user2); user1.attack(user2); user1.attack(user2);
		  user1.attack(user2); user1.attack(user2); user1.attack(user2);
		  
		  System.out.println(user1.toString()); System.out.println(user2.toString());
		  
		  
		  BlackSmith bm = new BlackSmith();
		  
		  //유저1의 무기를 대장장이에게 맡긴다. bm.repaire(user1.Weapon);
		  System.out.println(user1.toString());
		  
		  bm.repaire((Repairable)user2.Weapon); 
		  
		  System.out.println(user2.toString());
	}
}
