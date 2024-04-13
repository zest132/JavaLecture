package joo.강의13;

public class Warrior implements Cloneable{
	String id;
	int hp;
	Point position;

	public Warrior(String id, int hp)
	{
		this.id = id;
		this.hp = hp;

	}
	
	public Warrior(String id, int hp, Point position)
	{
		this(id,hp);
		this.position = position;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID:"+id+" 체력:"+hp;
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
		
		result.position = new Point(position.x,position.y,position.z);
		
		
		return result;
	}
}
