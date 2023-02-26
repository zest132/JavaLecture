package joo;

public abstract class Unit {

	int hp;
	static int power;
	static int armor;
	public static int count=0;
	
	
	Unit()
	{
		count++;
	}
	
	abstract void attack();
	
	
	
	public String toString()
	{
		return "체력: "+hp+"\t 공격력:"+power + "\t 방어력:"+armor;
	}

	public void powerUp()
	{
		power++;
	}
	
	public void armorUp()
	{
		armor ++;
	}
}
