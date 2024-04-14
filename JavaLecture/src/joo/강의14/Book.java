package joo.강의14;

public class Book {

	
	String title;
	String author;
	
	
	Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "제목:"+title+" 저자:"+author;
	}
}
