package joo.강의13;

public class People implements Cloneable{

	String RRN ;
	String name;
	int age;
	Phone phone;
	
	

	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj instanceof People)
			return this.RRN.equals(((People)obj).RRN) ;
		else
			return false;
		
	}
	
	@Override
	public String toString() {
		
		return "주민번호: "+ RRN + " 이름: " + name+ " 나이:" + age;
	}
	
	@Override  
	public People clone() {
		
		Object result = null;
		try
		{
			result = super.clone();
			
		}catch(CloneNotSupportedException ex)
		{
			System.out.println(ex);
		}
		return (People)result;
	}
	
	public People deepCopy()
	{
		People result = this.clone();
		
		result.phone = new Phone(this.phone.Model,this.phone.serialNumber);

		return result;
	}
	
}
