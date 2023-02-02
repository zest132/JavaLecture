package joo;

public class 복습문제1주차 {

	public  void 문제9()
	{
		int x = 2;
		int y = 7;
		char c = 'A'; 
		System.out.println(1 + x < 3);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(y >= 7 || x > 0 && x <= 3);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('8'-'0');
		System.out.println(x);
	}
	
	public   void 문제10()
	{
		char ch = '3';
		
		boolean result = (ch-'0') >=0 && ('9'-ch) <=9; 
		
		System.out.println(result);
	}
}
