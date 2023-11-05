package joo.강의11.RPG;

public class Gun extends Weapon implements Repairable{

	
	public Gun()
	{
	
	}
	
	public Gun(int damage, int durability)
	{
		super( damage,  durability);
	}

	@Override
	public void repaired() {
		this.durability++;
		
	}
}
