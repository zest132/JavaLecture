package joo.강의14;

public class Account {
	
	 int money=10000;

	public   void  withdraw(int money) 
	{
		synchronized(this) {
			//출금하려는 금액보다 많아야 출금을 진행한다.
			if(this.money >= money)
			{
				try{
					
					Thread.sleep(2000);
				}catch(Exception ex)
				{
					
				}
				this.money -= money;
			}
		}
		
			
	}
}
