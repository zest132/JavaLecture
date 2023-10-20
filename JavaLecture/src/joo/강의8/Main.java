package joo.강의8;



public class Main {

	public static void main(String[] args) {

		final int LIST_CNT = 10;
		
		Student[] studentList  = new Student[LIST_CNT];
		Student[] sortList = new Student[LIST_CNT];
		
		System.out.println("---------정렬 전---------");
		for(int i =0 ; i<LIST_CNT ; i++)
		{
			Student std = new Student("학생"+i
									,(int)(Math.random()*101)
									,(int)(Math.random()*101)
									,(int)(Math.random()*101));
				
			std.showState();
			studentList[i]= std;
			
		}
		
		for(int i =0 ; i<LIST_CNT ; i++)
		{
			//성적이 가장 낮은 학생을 가져온다.
			Student LastStudent = Student.getMinAvg(studentList);
			
			//해당 학생의 이름으로 몇번 인덱스 인지 찾는다.
			int targetIndex = Student.getIndex(studentList, LastStudent.name);
			
			//해당 학생의 객체주소를 새로운 배열에 넣는다.
			sortList[i] = studentList[targetIndex];
			
			//기존 배열에 null을 대입하여 제거한다.(새로운 배열에서 해당 객체를 가리키고 있기에 문제 없다.)
			studentList[targetIndex] = null;
			
		}
		
		System.out.println("---------정렬 완료---------");
		for(Student std : sortList)
			std.showState();
		
	
	}

}

 
