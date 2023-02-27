package joo;

public class Marine extends Unit{

	String name;
	public static int count;
	
	
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
	
	
	
	public void attack()
	{
		System.out.println("총을 쏩니다.");
		
	}
		
	

	

	

	
	
	
}
