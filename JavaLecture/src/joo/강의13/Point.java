package joo.강의13;

public class Point {

	int x;
	int y;
	int z;
	
	Point(int x, int y ,int z)
	{
		this.x= x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		
		if(obj instanceof Point)
		{
			Point p =(Point)obj;
			//return x==p.x && y==p.y && z==p.z;
			return this.toString().equals(p.toString());
			
		}
			return  false;
			
	}
	
	@Override
	public String toString() {
	
		return "x: " + x + " y: "+ y+" z: "+ z;
	}
}
