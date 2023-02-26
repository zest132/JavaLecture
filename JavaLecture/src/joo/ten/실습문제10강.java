package joo.ten;

import joo.Marine;
import joo.Unit;
import joo.Zergling;

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
}
