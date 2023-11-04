package joo.강의11;

public abstract class Item {
	
	
	public int barcodNumber;
	public String name;
	public int price;
	int mileagePercent;
	public Item()
	{
		
	}
	
	public Item(int barcodNumber,String name, int price)
	{
		this.barcodNumber = barcodNumber;
		this.name = name;
		this.price = price;
	}

	public String toString()
	{
		return "바코드:"+barcodNumber+"\t물품명: "+ name + "\t가격: "+price;
	}
	
}




