package joo.강의13;


import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T>{
	
	
	
	
	
	private Object[] list = new Object[10];
	
	void add(T item)
	{
		//size 메서드가 있으니 더이상 반복문을 사용할 필요 없다.
		int index = this.size();
		
		//배열이 가득차 있으면
		if(index >= list.length)
		{
			Object[] temp = new  Object[list.length+10];
			
			//요소들을 옮긴다.
			for(int i =0; i <this.size();i++)
				temp[i] = list[i];
		
			//배열의 주소값을 새로운 배열의 주소로 교체 한다;
			list = temp;
		}
		//새로운아이템을 추가한다.
		list[index] = item;
		
	}
	
	T get(int index)
	{
		if(list.length<= index)//배열의 사이즈를 넘어서면
			throw new ArrayIndexOutOfBoundsException("현재 요소의 범위를 넘었습니다.");
		else if(index <0) // 음수라면
			throw new IllegalArgumentException("음수 index는 불가능합니다");
		
		
		return (T)list[index];
	}
	
	int size()
	{
		int cnt=0;
		
		//삭제시 요소를 당겨와서 중간에 null로 비어져 있는 케이스는 없다고 가정하고 만든다.
		for(Object item : list)
		{
			if(item == null)
				break;
			
			cnt++;
		}
		
		return cnt;
	}
	
	void remove(int index)
	{
		if(list.length<= index)//배열의 사이즈를 넘어서면
			throw new ArrayIndexOutOfBoundsException("현재 요소의 범위를 넘었습니다.");
		else if(index <0) // 음수라면
			throw new IllegalArgumentException("음수 index는 불가능합니다");
		
		//그냥 뒤에 요소를 해당 칸으로 옮기면 되므로 null로 초기화 하는 작업은 불필요하다고 느낄수도 있다.
		//그러나 마지막 요소를 지우는 상황이라면 뒤의 요소가 없기때문에 해당 index 번호를 초기화 해줄 필요가 있다.
		list[index] = null;
		
		for(int i = index;i<list.length-1;i++)
		{
			list[i] = list[i+1];
		}
		
		//한칸식 당겼으므로 마지막 요소는 비워둔다.
		list[list.length-1] = null;
	}
	
	
	
	
	
	
	
	
	
}
