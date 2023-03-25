package joo.강의12;

public class MyMath {

	class CanNotAddZeroException extends RuntimeException{}
	
	class CanNotMinusZeroException extends RuntimeException{}
	int add(int a,int b)
	{
		
		
		if(a==0 || b==0)
		{
			throw new  CanNotAddZeroException();
		}

		return a+b;
	}
	
	
	int minus(int a, int b)
	{
		if(a==0 || b==0)
			throw new CanNotMinusZeroException();
		
		
		return a-b;
	}
}
