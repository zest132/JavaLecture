package joo.강의11;




public class TV extends Item{
	
	public TV()
	{
		
	}
	
	//1% 적립이 아니라서 3퍼센트로 변경
	public TV(int barcodNumber, String name,int price) 
	{
		super(barcodNumber,name, price,3);
	}
}
