package joo.강의10;

public class Time {

	int hour;
	int minute;
	int second;
	
	public String toString()
	{
		return hour +"시 "+minute+ "분 "+second+"초";
	}
	
	
	
	public int getHour()
	{
		return hour;
	}
	
	public void setHour(int hour)
	{
		if(hour>=0 && hour<=23)
			this.hour = hour;
	
	}
	
	public int getMinute()
	{
		return hour;
	}
	
	public void setMinute(int minute)
	{
		if(minute>=0 && minute<=59)
			this.minute = minute;
	
	}
	

	public int getSecond()
	{
		return second;
	}
	
	public void setSecond(int second)
	{
		if(second>=0 && second<=59)
			this.second = second;
	
	}

	

	
}
