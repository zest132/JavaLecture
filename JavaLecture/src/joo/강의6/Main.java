package joo.강의6;




class test
{
	
	
	
	
	
	

	
}

 class HanoiTower {
	 
	 
	void resolve(int n, char from ,char tmp, char to)
	{
		if(n==1) 
			System.out.println("원판 1을 "+from + "에서 " + to +"으로 옮긴다.");
		else
		{
			resolve(n-1,from,to,tmp);
			System.out.println("원판 "+n+"를 "+from+"에서 "+to+"으로 옮긴다.");
			resolve(n-1,tmp,from,to);
		}
			
			
		
	}
}














public class Main {
	
	
	public static void main(String[] args) {
		
		int[] student = new int[5];
		
		student[0]=10;
		student[1]=50;
		student[2]=30;
		
		student = new int[10];
		
		System.out.println(student[0]);
		System.out.println(student[1]);
		System.out.println(student[2]);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int  add(int x, int y)
	{
		int result =x+y;
		
		return result;
	}
	public static void 실습문제1_1()
	{
		Tv t1 = new Tv();
		
		t1.turnOn();
	}

	public static void 실습문제2_1()
	{
		MyMath math = new MyMath();
		
		int result = math.subtract(math.add(
											math.divide(500, 5)
										  , math.multiply(3, 27)), 5);
		System.out.println(result);
		System.out.println(500/5+3*27-5);
	}
	
	public static void 실습문제2_2()
	{
		Student[] students = new Student[5];
		
		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		students[3] = new Student();
		students[4] = new Student();
		
		System.out.println("국어\t영어\t수학\t합계\t평균");
		for(Student student : students)
		{
			student.kor = (int)(Math.random()*100)+1;
			student.eng = (int)(Math.random()*100)+1;
			student.math = (int)(Math.random()*100)+1;
			
			System.out.println(student.kor
						+"\t"+student.eng
						+"\t"+student.math
						+"\t"+student.getTotal()
						+"\t"+student.getAverage());
		}
	}
	
	public static void 실습문제3_1()
	{
		MyMath math = new MyMath();
		
		float result = math.add(30.5f, 25.5f);
		
		System.out.println(result);
		
		double result2 = math.add(30.5, 25.5);
		
		System.out.println(result2);
		
		
		
	}
	
	public static void 실습문제3_2()
	{
		MyMath math = new MyMath();
		
		System.out.println(math.avg(32,10,320,40,10,-5,3));
		
		System.out.println(math.max(32,10,320,40,10,-5,3));
		
		System.out.println(math.min(32,10,320,40,10,-5,3));
		
	}
	
	public static void 실습문제3_3()
	{ 	
		MyMath math = new MyMath();
		
		long result = math.power(3, 4);
		
		System.out.println(result);
	}
	
	
	public static void 실습문제3_4()
	{
		HanoiTower ht = new HanoiTower();
		
		ht.resolve(5, 'A', 'B', 'C');
	}
	
	
}
