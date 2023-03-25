package joo.강의10;

public class serverConnection {

	static serverConnection instance;
	
	private serverConnection()
	{
		
	}
	
	public static serverConnection getInstance()
	{
		if(instance==null)
			instance = new serverConnection();
		
		
		return instance;
	}
}
