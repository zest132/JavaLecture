package joo.eleven;

public abstract class Item {
	
	
	public int barcodNumber;
	public String name;
	public int price;
	public int mileagePercent;
	
	public Item(int barcodNumber,String name, int price)
	{
		this.barcodNumber = barcodNumber;
		this.name = name;
		this.price = price;
		this.mileagePercent = 1;
	}
	
	public Item(int barcodNumber, String name, int price,int mileagePercent)
	{
		this(barcodNumber,name,price);
		this.mileagePercent = mileagePercent;
	}
	
	public String toString()
	{
		return "물품명: "+ name + " 가격: "+price;
	}
	
}




