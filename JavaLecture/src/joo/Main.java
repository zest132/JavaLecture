package joo;

import java.util.Arrays;
import java.util.Scanner;





class Tv
{
	//데이터(멤버변수)
	String color;
	boolean power = false;
	int channel =0;
	
	String state;
	//기능(메서드)
	void TurnOn()
	{
		if(state.equals("고장"))
			return;
		
		power = true;
		
	}
	
	
	
	void TurnOff()
	{
		power = false;
	}
	void ChannelUp()
	{
		channel++;
	}
	void ChannelDown()
	{
		channel--;
	}	
	
	
	
}






public class Main {

	public static void main(String[] args) {
		
		Archer[] archers = new Archer[10];
		Archer[] sortedArchers = new Archer[archers.length];
		
		int userNumber=0;
		for(Archer archer : archers)
		{
			archer = new Archer();
			archer.name ="유저"+userNumber;
			archer.hp = (int)(Math.random()*100)+1;
			archer.power = (int)(Math.random()*50)+1;
			archer.armer = (int)(Math.random()*10)+1;
			archer.showState();
			archers[userNumber] = archer;
			userNumber++;
			
		}
		
		for(Archer insertArcher : archers)
		{
			for(int i =0 ; i<sortedArchers.length-1;i++)
			{
				if(sortedArchers[i] == null)
				{
					sortedArchers[i] =insertArcher;
					break;
				}
				else if(sortedArchers[i].power >=  insertArcher.power)
				{
					System.arraycopy(sortedArchers, i, sortedArchers, i+1, sortedArchers.length-1-i);
					sortedArchers[i] =insertArcher;
					break;
				}
					
			}
			
		}
		
		System.out.println("---공격력순으로 정렬---");
		for(Archer archer : sortedArchers)
			archer.showState();
		
	}

}
