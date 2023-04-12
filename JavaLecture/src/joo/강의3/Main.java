package joo.강의3;

import java.util.Scanner;

import joo.Util;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		실습문제1_4();

	}
	
	
	public static void 실습문제1_1()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("값을 입력하세요: ");
		int a = scan.nextInt();


		if(a>=50)
			System.out.println("50 이상입니다.");
		
		if(a<50)
			System.out.println("50 미만입니다.");
	}
	
	public static void 실습문제1_2()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("값을 입력하세요: ");
		int input = scan.nextInt();
		
		if(input %3 ==0)
			System.out.println("3의 배수입니다.");
		
	}
	
	public static void 실습문제1_3()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("성적을 입력하세요: ");
		int score = scan.nextInt();
		
		if(score >=90) System.out.println("A학점입니다.");
		else if(score >=80) System.out.println("B학점입니다.");
		else if(score >=70) System.out.println("C학점입니다.");
		else if(score >=60) System.out.println("D학점입니다.");
		else System.out.println("F학점입니다.");
		
		
	}
	
	public static void 실습문제1_4()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();

		
		int max = number1;
		
		if(max<number2) max = number2;
		
		if(max<number3) max = number3;
		
		System.out.println("최대값은 "+ max+"입니다.");
		
		
	}
	
	public static void 실습문제2_1()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("월을 입력하세요.");
		int month = scan.nextInt();
		
		switch(month)
		{
			case 3,4,5:
				System.out.println("봄입니다.");
				break;
			case 6,7,8:
				System.out.println("여름입니다.");
				break;
			case 9,10,11:
				System.out.println("가을입니다.");
				break;
			case 12,1,2:
				System.out.println("겨울입니다.");
				break;
		}
		
	}
	
	public static void 실습문제2_2_A()
	{
		
		int computer = (int)(Math.random()*3)+1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1) 바위(2) 보(3) 선택하세요");
		int user = scan.nextInt();
		
		if(!(user >=1 && user<=3)) 
		{
			System.out.println("잘못 선택하였습니다."); 
			return ;
		}

		System.out.println("당신은 "+ (user==1 ? "가위": user ==2 ? "바위":"보") + "입니다." );
		System.out.println("컴퓨터는 "+ (computer==1 ? "가위": computer ==2 ? "바위":"보") + "입니다." );
		
		switch(user)
		{
			case 1: // 사용자가 가위
				switch(computer)
				{
					case 1: System.out.println("무승부"); break;
					case 2: System.out.println("패배"); break;
					case 3: System.out.println("승리"); break;
				}
				break;
			case 2:
				switch(computer)
				{
					case 1: System.out.println("승리"); break;
					case 2: System.out.println("무승부"); break;
					case 3: System.out.println("패배"); break;
				}
				break;
			case 3:
				switch(computer)
				{
					case 1: System.out.println("패배"); break;
					case 2: System.out.println("승리"); break;
					case 3: System.out.println("무승부"); break;
				}
				break;
		}
	}
	
	public static void 실습문제2_2_B()
	{
		
		int computer = (int)(Math.random()*3)+1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1) 바위(2) 보(3) 선택하세요");
		int user = scan.nextInt();
		
		

		if(!(user >=1 && user<=3)) 
		{
			System.out.println("잘못 선택하였습니다."); 
			return ;
		}

		System.out.println("당신은 "+ (user==1 ? "가위": user ==2 ? "바위":"보") + "입니다." );
		System.out.println("컴퓨터는 "+ (computer==1 ? "가위": computer ==2 ? "바위":"보") + "입니다." );
		
		switch(computer - user)
		{
			case 0:
				System.out.println("비겼습니다.");
				break;
			case -1,2:
				System.out.println("이겼습니다.");
				break;
			case -2,1:
				System.out.println("패배하였습니다.");
				break;
		}
		
	}
	
	public static void 실습문제3_1()
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("정수를 입력하세요");
		int input = scan.nextInt();
		
		
		
		if(input>0)
			System.out.println("양수입니다.");
		else if(input==0)
			System.out.println("0입니다.");
		else
			System.out.println("음수입니다.");
		
	}
	
	public static void 실습문제3_2_A()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		
		int mid=0;


		if(number1>=number2) 
		{
			if(number3>=number1) {
				mid = number1;
			}else if(number3<=number2) {
				mid = number2;
			}else {
				mid = number3;
			}
		}//number1<number2
		else if(number3<number1) 
			mid = number1;
		else if(number3>number2) 
			mid = number2;
		else 
			mid = number3;

		System.out.println("중간값은 : "+mid+ "입니다.");
	}
	
	
	public static void 실습문제3_2_B()
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("정수를 입력하세요");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
			
		int max = number1;
		int min = number1;
	
		if(max <number2) max = number2;
		if(max <number3) max = number3;
		
		if(min> number2) min = number2;
		if(min> number3) min = number3;
		

		
		int mid = number1+number2+number3-max-min;
		
		System.out.println("중간값은 " + mid+"입니다");
		
	}
	
	public static void 실습문제3_2_오답()
	{
		int number1=2;
		int number2=1;
		int number3=3;
		
		int mid =number3;
		
		if(mid <number1) mid = number1;
		if(mid >number2) mid = number2;
	
		
		System.out.println(mid);
	}
	
	public static void 실습문제3_3()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요.");
		
		int year=scan.nextInt();
		
		
		if((year %4 ==0 && year %100!=0 )|| year%400==0)
			System.out.println(year+"년은 윤년입니다.");
		else
			System.out.println(year+"년은 평년입니다.");
	}
	
	public static void 실습문제3_3_오답()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		String input = scan.nextLine();
		int year=Integer.parseInt(input);
		
		int result = ((year%4)%100)%400;
		switch(result)
		{
			case 0:
				System.out.println(year+"년은 윤년입니다");
				break;
				default:
				System.out.println(year+"년은 평년입니다");
		}
	}
	
}
