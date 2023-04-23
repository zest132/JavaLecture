package joo.강의10;

public class People {

	String name;
	int age;
	final String juminNumber;
	final String gender;
	
	People(String name , int age , String juminNumber,String gender)
	{
		this.name = name;
		this.age = age;
		this.juminNumber = juminNumber;
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
	
		return "이름:" + name +"\t나이:" + age+"\t주민번호:"+juminNumber + "\t성별:"+gender;
	}
}
