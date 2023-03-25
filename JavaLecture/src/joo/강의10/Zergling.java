package joo.강의10;

public class Zergling extends Unit{
	
	String name;
	int hp=35;
	static int power=5;
	static int armor=0;
	public static int count;
	public Zergling()
	{
		hp = 40;
		power = 5;
		armor = 0;
		count++;
	}
	
	
	Zergling(String name)
	{
		this.name = name;
	}
	
	
	@Override
	public void attack(Unit target) {
		// TODO Auto-generated method stub
		
	}

	public void attack() {
		System.out.println("박치기를 합니다!");
		
	}
	


}
