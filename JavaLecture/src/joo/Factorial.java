package joo;

public class Factorial {
	int factorial(int n)
	{
		//입력값 필터링
		if(n >=13 || n<0)
			return 1;
			
		if(n ==1)
			return 1;
		
		return n*factorial(n-1);
	}
}
