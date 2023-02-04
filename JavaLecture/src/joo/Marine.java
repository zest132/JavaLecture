package joo;

public class Marine {

	int hp=40;
	static int power=4;
	static int armor=0;

	
	void attack(Marine target)
	{
		
		target.hp -=(power-target.armor);
	}
		
	
	
	void showState()
	{
		System.out.println("체력: "+hp+"\t 공격력:"+power + "\t 방어력:"+armor);
	}
	
	void powerUp()
	{
		power++;
	}
	
	void armorUp()
	{
		armor ++;
	}
	
	
	
	
}
