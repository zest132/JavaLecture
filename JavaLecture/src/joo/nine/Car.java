package joo.nine;

public  class Car {
	
	
	 int speed;
	
	 public Door doors[] = new Door[4];
	 
	 public Car()
	 {
		 
		//문 4개를 생성한다.
		 for(int i =0;i<doors.length;i++)
			 doors[i] = new Door();
	 }
	 
	 void go(int speed)
	{
		this.speed = speed;
	}
	
	
	
	 void stop()
	{
		speed = 0;
	}

}