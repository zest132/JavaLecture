package joo.강의14;

public class People {
	
	public enum HOBBY{SOCCER("축구"),BASEBALL("야구"),COOK("요리"),RUNNING("달리기");
		
	String value;
		HOBBY(String value)
		{
			this.value = value;
		}
	}
	
	
	HOBBY hobby;
}
