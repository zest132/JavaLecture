package joo.nine;

public class Door {
	
	public boolean isOpen = false;
	
	public String name;
	public void open()
	{
		isOpen = true;
	}
	
	public void close()
	{
		isOpen = false;
	}
}
