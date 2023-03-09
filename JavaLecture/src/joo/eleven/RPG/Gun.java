package joo.eleven.RPG;

public class Gun extends Weapon implements Repairable{

	public Gun(int damage, int durability)
	{
		super( damage,  durability);
	}
	
	@Override
	public void repaired() {
		this.durability++;
		
	}
}
