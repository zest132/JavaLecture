package joo.강의11;



// 팀장님이 만들라고 해서 만드는데... 어떤 기능들 넣어야 하지...?
// 아 상속받으니 시그니처가 다 정해져 있고 무조건 만들어야 하네?
public class Tank extends Unit implements Repairable1{

	@Override
	public void attack(Unit target) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void repaired() {
		this.hp++;
		
	}
}
