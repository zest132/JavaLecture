package joo.eleven.RPG;

public abstract class Weapon {
	
	int damage;
	int durability;
	
	public Weapon(int damage, int durability)
	{
		this.damage = damage;
		this.durability = durability;
	}
	
	
	public String toString()
	{
		return "데미지: " + damage + " 내구도: "+ durability;
	}
}
