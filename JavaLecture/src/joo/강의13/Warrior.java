package joo.강의13;

public class Warrior implements Cloneable{
	String id;
	int hp;
	Point pt;

	public Warrior(String id, int hp, Point pt)
	{
		this.id = id;
		this.hp = hp;
		this.pt = pt;
	}
	
	@Override
	public Warrior clone()   {
		
		Warrior result = null;
		try
		{
			
			result = (Warrior)super.clone();
			
		}catch(CloneNotSupportedException ex)
		{
			return result;
		}
		
		return result;
		
	}
	
	public Warrior deepCopy()
	{
		Warrior result = this.clone();
		
		result.pt = new Point(pt.x,pt.y,pt.z);
		
		
		return result;
	}
}
