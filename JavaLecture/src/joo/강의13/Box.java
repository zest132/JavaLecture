package joo.강의13;

public class Box<T> {

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
