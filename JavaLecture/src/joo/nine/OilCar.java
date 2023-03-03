package joo.nine;

public class OilCar extends Car{

	public int Oil;
	
	public OilCar()
	{
		
	}
	
	public boolean engineOilCheck()
	{
		System.out.println("엔진 오일을 점검 하였습니다.");
		return true;
	}
}
