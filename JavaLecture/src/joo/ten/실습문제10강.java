package joo.ten;

import joo.eleven.Marine;
import joo.eleven.Unit;
import joo.eleven.Zergling;

public class 실습문제10강 {

	
	public void 문제2_3()
	{
		Marine marine = new Marine();
		Marine marine2 = new Marine();
		Zergling zergling = new Zergling();
		
		
		marine.attack();
		zergling.attack();
		
		System.out.println(marine.toString());
		marine.powerUp();
		System.out.println(marine2.toString());
		
		System.out.println(Unit.count);
		System.out.println(Marine.count);
		System.out.println(Zergling.count);
	}
	
	public void 문제3_2()
	{
		serverConnection con = serverConnection.getInstance();
		serverConnection con1 = serverConnection.getInstance();
		serverConnection con2 = serverConnection.getInstance();
		serverConnection con3 = serverConnection.getInstance();
		
		//주소가 모두 동일하게 나온다.
		System.out.println(con);
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
		
		
		
	}
}
