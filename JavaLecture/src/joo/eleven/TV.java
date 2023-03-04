package joo.eleven;

public class TV extends Item{
	
	
	//1% 적립이 아니라서 오버라이딩 하여 3퍼센트로 변경
	public TV(int barcodNumber, String name,int price) 
	{
		super(barcodNumber,name, price,3);
	}
}
