package joo.강의11.RPG;

public class BlackSmith {
	
	
	public class CanNotRepairException extends RuntimeException
	{
		
		public CanNotRepairException(String msg)
		{
			super(msg);
		}
	}
	
	/*
	public Boolean repaire(Weapon weapon)
	{
		if(weapon instanceof Repairable)
			weapon.durability+=10;
		else 
			throw new CanNotRepairException("수리불가");
		
		
		return true;
	}*/
	
	
	
	public void repaire(Weapon weapon)
	{
		if(weapon instanceof Repairable)
		{
			Repairable temp = (Repairable)weapon;
			
			temp.repaired();
			//weapon.durability+=10;
			
		}
		else 
			System.out.println("수리가 불가능한 무기입니다.");
	}
	
	
	public void repaire(Repairable repairable)
	{
		repairable.repaired();
	}
	
	
	
}
