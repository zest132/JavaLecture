package joo.강의6;

public class MyMath {
	
	int add(int x, int y)
	{
		return x+y;
	}
	
	
	
	float add(float x, float y)
	{
		return x+y;
	}
	double add(double x, double y)
	{
		return x+y;
	}
	int subtract(int x, int y)
	{
		return x-y;
	}
	int multiply(int x, int y)
	{
		return x*y;
	}
	
	int divide(int x, int y)
	{
		return x/y;
	}
	
	int avg(int... n)
	{
		int sum=0;
		for(int i : n)
			sum+= i;
		
		return sum/n.length;
	}
	
	int max(int... n)
	{
		int max = n[0];
		
		for(int i : n)
			if(max<i)
				max = i;
		
		
		return max;
	}
	
	int min(int... n)
	{
		int min = n[0];
		
		for(int i : n)
			if(min>i)
				min = i;
		
		
		return min;
	}
	

	/*
	long power(long x , long n)
	{
		if(n ==1)
			return x;
		
		
		return x*power(x,n-1);
	}
*/
	
	
	long power(long x,long n)
	{
		if(n==1)
			return x;
		
		//짝수
		if(n%2 ==0)
			return power(x*x,n/2);
		else 
			return x*power(x*x,(n-1)/2);
	
	}
}
