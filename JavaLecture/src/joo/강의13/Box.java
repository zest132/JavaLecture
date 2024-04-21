package joo.강의13;

import joo.강의14.Book;

public class Box<T extends Book> {

	private T item;
	
	public void setItem(T item)
	{
		this.item = item;
	}
	
	public T getItem()
	{
		return this.item;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
}
