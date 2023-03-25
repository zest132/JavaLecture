package joo.강의11;



public class Marine extends Unit{

	String name;
	public static int count;
	public static int  Power;
	
	public Marine()
	{
		
		hp = 50;
		power = 4;
		armor = 0;
		count++;
	}
	
	
	Marine(String name)
	{
		this.name = name;
	}
	
	

	public void attack(Unit target)
	{
		target.hp -=(Power-target.armor);
	}
	
	

	
	
	public void attack(Zergling target)
	{
		
		target.hp -=(Power-target.armor);
		System.out.println("총을 쏩니다.");
		
	}

	public void attack(Marine target)
	{
		target.hp -=(Power-target.armor);
		System.out.println("총을 쏩니다.");
		
	}

	public void attack(Zealot target)
	{
		target.hp -=(Power-target.armor);
		System.out.println("총을 쏩니다.");
		
	}

	
	
	
}
