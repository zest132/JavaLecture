package joo.강의14;

public class Student {

	public enum STATE{
		
		RUNNING(5),SLEEPING(0),STUDYING(-1),EATING(10);
		
		public  int value;
		STATE(int value)
		{
			this.value= value;	
		}
	}

	public STATE state;
	
	public Student()
	{
		state = STATE.SLEEPING;
	}
	
	public void goToSchool()
	{
		switch(state)
		{
			case RUNNING: System.out.println("열심히 가는중이야!"); break;
			case SLEEPING: System.out.println("..."); break;
			case STUDYING: System.out.println("이미 등교 했는걸?"); break;
			case EATING: System.out.println("이것만 먹고 갈게"); break;
			
		}
	}
	
}
