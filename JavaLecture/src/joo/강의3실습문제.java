package joo;

import java.util.Scanner;

public class 강의3실습문제 {

	
	/*
	 * 키보드로 숫자를 입력 받아 3의배수이면 “3의배수입니다“ 를 출력 하는 프로그램을 만드시오
	 */
	public void 문제1_1()
	{
		int number = Util.getKeyBoardValueInt("숫자를 입력하세요");
		
		if(number %3 == 0)
			System.out.println("3의 배수입니다.");
		
	}
	
	/*
	 * 키보드로 성적을 입력 받아  아래의 기준대로 출력하시오
		90점 : A학점
		80~89 : B학점
		70~79 : C학점
		60~69 : D학점
		그 이하 : F학점

	 */
	public void 문제1_2()
	{
		int score = Util.getKeyBoardValueInt("성적을 입력하세요");
		
		if(score >= 90)
			System.out.println("A학점입니다.");
		else if(score >= 80)
			System.out.println("B학점입니다.");
		else if(score >= 70)
			System.out.println("C학점입니다.");
		else if(score >= 60)
			System.out.println("D학점입니다.");
		else
			System.out.println("F학점입니다.");
		
	}
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	public void 문제2_1()
	{
		int month = Util.getKeyBoardValueInt("월을 입력하세요: ");
		
		switch(month)
		{
			case 3: case 4: case 5:
				System.out.println("봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("가을입니다.");
				break;
			case 12: case 1: case 2:
				System.out.println("겨울입니다.");
				break;
		}

	}
	
	
	
	public void 문제2_2()
	{
		
		int user= Util.getKeyBoardValueInt("가위(1) 바위(2) 보(3) 선택하세요");
		
		int computer = (int)(Math.random()*3)+1;
		
		
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
	public void 문제2_2_2()
	{
		int user= Util.getKeyBoardValueInt("가위(1) 바위(2) 보(3) 선택하세요");
		
		int computer = (int)(Math.random()*3)+1;
		
		
		if(!(user >=1 && user<=3)) 
		{
			System.out.println("잘못 선택하였습니다."); 
			return ;
		}
		
		System.out.println("당신은 "+ (user==1 ? "가위": user ==2 ? "바위":"보") + "입니다." );
		System.out.println("컴퓨터는 "+ (computer==1 ? "가위": computer ==2 ? "바위":"보") + "입니다." );
		
		
		switch(computer - user)
		{
			case 0: System.out.println("무승부입니다."); break;
			case -1:  case 2:System.out.println("승리"); break;
			case -2:  case 1:System.out.println("패배"); break;
		}
		
	}
	
	public void 최종실습_1()
	{
		int number=Util.getKeyBoardValueInt("정수를 입력하세요");
		if(number>0)
			System.out.println("양수입니다.");
		else if(number == 0)
			System.out.println("0입니다.");
		else
			System.out.println("음수입니다.");
	}
	
	
	/*
	 * 변수 year에 년도를 입력받아 해당 년도가 윤년인지 아닌지 출력하시오
		윤년 : 2월29일이 있는 해
  		조건 : 4로 나누어 떨어지는 해 ex) 2004, 2008
            이중에서 100으로 나누어 떨어지는해는 평년이다.
            이중에서 400으로 나누어 떨어지면 윤년이다.
	 * */
	public void 최종실습_2()
	{
		int year=Util.getKeyBoardValueInt("년도를 입력하세요");
		if((year %4 ==0 && year %100!=0 )|| year%400==0)
			System.out.println(year+"년은 윤년입니다.");
		else
			System.out.println(year+"년은 평년입니다.");
		
	}
	
	/*
	 * 
	 * 숫자 3개를 입력 받아 중간 크기의 숫자를 출력하시오

	 * 
	 * */
	public void 최종실습_3_1()
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
	
	public void 최종실습_3_2()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		
		int max = number1;
		int min = number1;
		
		if(max <number2) max = number2;
		if(max <number3) max = number3;
		
		if(min >number2) min = number2;
		if(min >number3) min = number3;
		
		//중간값 구하기
		int mid = number1+number2+number3 - max-min;
		
		System.out.println("중간값은 : "+mid+ "입니다.");

	}
}
