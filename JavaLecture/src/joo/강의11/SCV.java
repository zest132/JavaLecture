package joo.강의11;



public class SCV extends Unit implements Repairable1{
	
	@Override
	public void repaired() {
		// TODO Auto-generated method stub
		this.hp++;
	}
	
	@Override
	public void attack(Unit target) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void repair(Repairable1 unit)
	{
		//해당 유닛은 Repairable 인터페이스를 상속받아 repaired 메서드를 구현해놨다.
		//유닛마다 각자의 수리속도와 방법이 다를텐데 SCV입장에선 고려할 필요가 없다.이것이 객체지향!
		unit.repaired();
	}
	

	
	
	
	
}
