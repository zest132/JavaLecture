package joo;

import joo.ten.Time;

public class Main {
	
	public static void main(String[] args) {
		
	Time t= new Time();
	
	t.setHour(30);
	System.out.println(t.toString());
	
	t.setHour(20);
	System.out.println(t.toString());
	
	t.setMinute(-50);
	System.out.println(t.toString());
	
	t.setMinute(50);
	System.out.println(t.toString());
		
	}
	


}
