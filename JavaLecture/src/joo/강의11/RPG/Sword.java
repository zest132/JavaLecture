package joo.강의11.RPG;

public class Sword extends Weapon implements Repairable{

	
	public Sword()
	{
		
	}
	
	public Sword(int damage, int durability)
	{
		super( damage,  durability);
	}
	
	
	@Override
	public void repaired() {
		
		this.durability+=2;
		
	}
}
