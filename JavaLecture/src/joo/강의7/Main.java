package joo.강의7;

import java.awt.Point;
import java.util.Calendar;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.money = 5000;
		
		p2.money = 10000;
		
		//p1이 p2에게 돈을 준다.
		p1.send(p2);
		
		System.out.println(p1.money);
		System.out.println(p2.money);
	}
	
	
	public static void 실습문제1_1()
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "홍길동";
		p1.RRN = "750215-1234567";
		
		p2.name = "김길동";
		p2.RRN = "850215-1234567";
		
		p3.name = "박길동";
		p3.RRN = "040215-2234567";
		
		
		System.out.println("이름:"+ p1.name + "\t주민번호: "+ p1.RRN);
		System.out.println("이름:"+ p2.name + "\t주민번호: "+ p2.RRN);
		System.out.println("이름:"+ p2.name + "\t주민번호: "+ p2.RRN);
		
	}
	
	public static void 실습문제1_2()
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.RRN="950101-1234567";
		p2.RRN="950101-6789123";
		
		String p1Gender = p1.getGender();
		String p2Gender = p2.getGender();
		
		System.out.println(p1Gender);
		System.out.println(p2Gender);
		
		p1.showState();
		p2.showState();
	}
	
	
	public static void 실습문제1_3()
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.RRN="010512-3234567";
		p2.RRN="950101-2789123";
		
		p1.showState();
		p2.showState();
	}
	
	public static void 실습문제2_1()
	{
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		
		m1.showState();
		m2.showState();
		
	}
	
	public static void 실습문제2_2()
	{
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.powerUp();
		m1.armorUp();
		
		
		m1.showState();
		m2.showState();
	}
	
	public static void 실습문제2_3()
	{
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.attack(m2);
		
		
		m1.showState();
		m2.showState();
	}
	
	public static void 실습문제2_4()
	{
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.position = new Point(2,2);
		
		m2.position = new Point(7,7);
		
		m1.attack(m2);
	}
}














