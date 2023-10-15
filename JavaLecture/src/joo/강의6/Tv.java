package joo.강의6;

public class Tv {

		String color;
		boolean power = false;
		int channel = 0;
		
		boolean powerCable;

		void turnOn()
		{
			//콘센트가 꼽혀 있는가?
			if(powerCable == true)
			{
				power = true;
			}
			else 
			{
				System.out.println("전원선을 연결해주세요");
			}
				
			
		}
		void turnOff()
		{
			power = false;
		}

	}

