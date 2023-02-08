package joo;

public class Marine {

	String name;
	int hp=40;
	static int power=4;
	static int armor=0;

	Marine()
	{
		
	}
	
	
	Marine(String name)
	{
		this.name = name;
	}
	
	void attack(Marine target)
	{
		target.hp -=(power-target.armor);
		
	}
		
	
	
	
	
	/*
	 * @return 타겟의 사망여부 true =사망 false = 생존
	 */
	boolean attack(Zergling target)
	{
		
		
		target.hp -=(power-target.armor);
		
		
		return target.hp<=0;
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
