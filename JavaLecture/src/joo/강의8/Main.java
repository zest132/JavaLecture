package joo.강의8;



public class Main {

	public static void main(String[] args) {

		Bird bird1 = new Bird();
		Bird bird2 = new Bird();
		Bird bird3 = new Bird();
		System.out.println("bird1 참조변수: "+bird1);
		System.out.println("bird2 참조변수: "+bird2);
		System.out.println("bird3 참조변수: "+bird3);
		
		bird1.eat();
		bird2.eat();
		bird3.eat();
	}

	public static void 실습문제1_1()
	{
		Student student1 = new Student();
		Student student2 = new Student("홍길동");
		Student student3 = new Student("김길동",32,50,90);
		
		System.out.println(student2.name);
		System.out.println(student3.name+"\t"
				+"국어:"+student3.kor+"\t"
				+"영어:"+student3.eng+"\t"
				+"수학:"+student3.math+"\t"
				);

	}
	
	public static void 실습문제1_2()
	{
		Student student1 = new Student();
		Student student2 = new Student("홍길동");
		Student student3 = new Student("김길동",32,50,90);

		
		System.out.println(student3.name+"님의 성적합계는 "
						 + student3.getTotal()+"입니다.");
		System.out.println(student3.name+"님의 평균은 "
						 +student3.getAverage()+"입니다.");

	}
	
	
	
	public static void 실습문제1_3()
	{
		Student student1 = new Student();
		Student student2 = new Student("홍길동");
		Student student3 = new Student("김길동",32,50,90);
		
		System.out.println("현재 생성된 학생 객체는:"+Student.count+"개 입니다.");

	}
	
	
	public static void 실습문제1_4()
	{
		final int LIST_CNT = 10;
		
		Student[] studentList  = new Student[LIST_CNT];

		for(int i =0 ; i<LIST_CNT ; i++)
		{
			Student std = new Student("학생"+i
									,(int)(Math.random()*101)
									,(int)(Math.random()*101)
									,(int)(Math.random()*101));
				
			std.showState();
			studentList[i]= std;
			
		}
		

		
		
	}
	
	public static void 실습문제1_5()
	{
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

 
