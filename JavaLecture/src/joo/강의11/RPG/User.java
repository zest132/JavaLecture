package joo.강의11.RPG;

public class User {

	String id;
	int hp;
	public Weapon Weapon;

	
	
	public User(String id, int hp, Weapon Weapon)
	{
		this.id = id;
		this.hp = hp;
		this.Weapon = Weapon;
	}
	
	public void attack(User target)
	{
		System.out.println(id+"님이 " +  target.id+"님을 공격하였습니다.");
		
		if(Weapon.durability <= 0)
		{
			System.out.println("내구도가 없어 데미지가 0이 들어갔습니다.");
			return;
		}
				
		target.hp -=Weapon.damage;
		
		//내구도 차감
		Weapon.durability--;
	}
	
	
	public String toString()
	{
		return "아이디: "+ id+" 체력: "+ hp + " 무기 : {"+ Weapon.toString()+"}";
	
	}
}
