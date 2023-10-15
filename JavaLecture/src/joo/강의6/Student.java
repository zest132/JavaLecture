package joo.강의6;

public class Student {
	
	public String name ;
	int kor ;
	int eng ;
	int math ;
	int etc;
	
	int getTotal()
	{
		return kor+eng+math+etc;
	}
	
	int getAverage()
	{
		return getTotal()/3;
	}
	
}
