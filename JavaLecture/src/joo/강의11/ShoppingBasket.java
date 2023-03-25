package joo.강의11;

import java.util.ArrayList;
import java.util.List;




public class ShoppingBasket {

	//현재 장바구니에 담긴 물품 리스트
	private List<Item> itemList = new ArrayList();
	
	

	public String getInfoList()
	{
		String infoList="";
		
		for(Item item: itemList)
			infoList += item.toString() + System.lineSeparator();
			
			return infoList;
	}
	

	public int getTotalPrice()
	{
		int sum =0;
		
		for(Item item: itemList)
			sum +=item.price;

		return sum;
	}
	
	public int getTotalMileage()
	{
		int sum =0;
		
		for(Item item: itemList)
			sum +=item.price / 100 *item.mileagePercent; 
			
		return sum;
	}
	
	public void addItem(Item item)
	{


		
		
		

	
		
			
	}
	
	
	
	
}
