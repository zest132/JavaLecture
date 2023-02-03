package joo;



class Point
{
	int x;
	int y;
}



 class MyTest {
	 
	Point getPoint()
	{
		 Point pt = new Point();
		 System.out.println(pt);
		 return pt;
	}
	void test(int localx)
	{
		localx++;
	}
	
	void test(Point localPt)
	{
		localPt.x++;
	}
}
