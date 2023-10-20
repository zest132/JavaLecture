package joo.강의8;

public class Student
{
	public String name ;
	int kor ;
	int eng ;
	int math ;
	static int count;
	

	{
		count++;
	}
	
	
	Student()
	{ 
		
	}
	
	Student(String name)
	{
		this.name = name;
		
	}
	
	Student(String name, int kor, int eng,int math)
	{
		this.name =name;
		this.kor =kor;
		this.eng = eng;
		this.math=math;
		
	}
	
	
	void showState()
	{
		System.out.println("이름:"+name
				+"\t국어:"+kor 
				+"\t영어:"+eng 
				+ "\t수학:"+math 
				+"\t합계:"+getTotal()
				+"\t평균:"+getAverage()
				);
	}
	
	int getTotal()
	{
		return kor+eng+math;
	}
	
	int getAverage()
	{
		return getTotal()/3;
	}
	
	static Student getMinAvg(Student[] list)
	{
		int minScore =101;
		Student target = null;
		for(int i =0 ; i<list.length;i++)
		{
			if(list[i] ==null)
				continue;
			
			if(minScore>list[i].getAverage())
			{
				minScore = list[i].getAverage();
				target =list[i];
			}
				
		}

		return target;
	}
	
	static int getIndex(Student[] list,String name)
	{
		for(int i =0 ; i<list.length ; i++)
		{
			if(list[i] == null)
				continue;
			
			
			//이름이 같다면
			if(list[i].name.equals(name))
				return i;
		}
		
		//찾지 못하면 -1을 반환한다.
		return -1;
	}
	
}