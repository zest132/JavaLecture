package joo.강의14;

public class MyThread extends Thread{
	
	@Override
	public void run() {

		System.out.println("쓰레드 내부에서 진행될 코드 입니다.");
		
		for(int i =0; i<100;i++)
			System.out.println("서브쓰레드"+i);

	}

}
