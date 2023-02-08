package joo;

public class TV {
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
