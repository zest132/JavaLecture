package joo;

public class Marine extends Unit{

	String name;

	
	
	Marine()
	{
		hp = 50;
	}
	
	
	Marine(String name)
	{
		this.name = name;
	}
	
	void attack(Marine target)
	{
		target.hp -=(power-target.armor);
		
	}
		
	
	
	boolean attack(Unit target)
	{
		target.hp -=(power-target.armor);
		
		return target.hp<=0;
	}
	

	
	/*
	 * @return 타겟의 사망여부 true =사망 false = 생존
	 */
	boolean attack(Zergling target)
	{
		
		
		target.hp -=(power-target.armor);
		
		
		return target.hp<=0;
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
