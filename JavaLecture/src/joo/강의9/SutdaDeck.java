package joo.강의9;

public class SutdaDeck {

	final int CARD_NUM = 20;
	public SutdaCard[] cards = new SutdaCard[CARD_NUM];
	public SutdaDeck() 
	{
	
		int cardNum ;
		for(int i =0 ; i<CARD_NUM ; i++)
		{
			int cardNumber =i%10+1; 
			boolean isKwang=false;
			
			if( cardNumber ==1 ||cardNumber ==3 || cardNumber ==8  )
				isKwang = true;
			else 
				isKwang = false;
			
			
			cards[i] = new SutdaCard(cardNumber,isKwang);
			
		}

			
	}

	public void shuffle()
	{

		for(int i=0; i<cards.length;i++) 
		{
			int target = (int)(Math.random()*cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[target];
			cards[target] = tmp;
		}
	}
	
	SutdaCard pick(int index) 
	{
		if(index < 0 || index >= CARD_NUM) // 배열의 범위 내에서만 되도록
			return null;
		
		return cards[index];
	}
	
	SutdaCard pick() 
	{
		int index = (int)(Math.random()*cards.length);
		
		return pick(index);  //pick 메서드를 활용한다. 
	}
}
