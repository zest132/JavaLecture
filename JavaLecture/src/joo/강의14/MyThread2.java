package joo.강의14;


public class MyThread2 implements Runnable{
	
	Account a = new Account();
	
	@Override
	public void run() {
			a.withdraw(7000);
	}
}
