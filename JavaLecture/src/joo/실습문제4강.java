package joo;

import java.util.Scanner;

public class 실습문제4강 {

	
		/*
		 * 삼각형 별찍기
		 */
		public void 문제1_1()
		{
			for(int i = 0 ;i<5; i++)
			{
				for(int j = 0 ;j<=i; j++)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
		
		/*
		 * 구구단 출력
		 */
		public void 문제1_2()
		{
			for(int i = 2 ;i<9; i++)
			{
				for(int j = 1 ;j<=9; j++)
				{
					System.out.println(i+" x " +j +" = "+ i*j);
				}
			}
		}
		
		
		/*
		 * 엑스 출력하기
		 */
		public void 문제1_3()
		{
			final int MAX = 10;
			
			for(int i = 0 ;i<=MAX; i++)
			{
				for(int j = 0 ;j<=MAX; j++)
				{
					if(i==j || MAX-i==j)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		
		
		/*
		 * while문을 이용해 1부터 10까지 출력
		 */
		public void 문제2_1()
		{
			int i=1;
			
			while(i<=10)
			{
				System.out.println(i);
				i++;
			}
			
		}
		
		/*
		 * 사용자로부터 숫자를 입력 받아 while을 이용해 각 자리의 합을 구하시오
		 * 예) 12345   -> 1+2+3+4+5 =15
		 */
		public void 문제2_2()
		{
			
			int number = Util.getKeyBoardValueInt("숫자를 입력하세요:");
			
			int sum = 0;
			
			while(number !=0)
			{
				//나머지연산을 하여 1의 자리의 숫자를 가져와 더한다.
				sum +=number%10;
				
				System.out.println("현재 합계 : "+ sum);
				
				//10으로 나누어 1의 자리를 없앤다.
				number /=10;
			}
				
			System.out.println("각 자리의 합계:" + sum);
			
			
			
			
		}
		
		/*
		 *  1+2+3+4…  합계를 누적하여 몇까지 올라가야 누적합계가 150이 되는지를 출력하시오 
		 */
		public void 문제2_3()
		{
			
			int sum = 0;
			
			int i=0;
			while(sum<150)
			{
				sum +=++i;
				System.out.println("누적 합계:"+sum+ "  현재 숫자 : "+i);
			}
			
		}
		
		/*
		 * 1. do while문을 이용하여 0~10까지 숫자중 짝수를 출력하자
		 */
		public void 문제3_1()
		{
			int i=0;
			
			do
			{
				if(i%2==0)
					System.out.println(i);
				
				
				i++;
			}while(i<=10);
		}
		
		/*
		 * 2. do while문을 이용하여 숫자 맞추기 게임을 만들어보자
		 */
		public void 문제3_2()
		{
			int count=0;
			Scanner scanner = new Scanner(System.in); //입력을 받기 위한 스캐너 객체를 생성
			
			
			int computer =(int)(Math.random()*100)+1;
			int user;
			
			do
			{
				//시도 횟수를 올린다.
				count++;
				
				System.out.println("1~100 사이의 숫자를 입력하세요:");
				 user = scanner.nextInt(); //키보드로부터 값을 입력 받아 저장한다.
				
				
				if(computer> user)
					System.out.println(user+" 보다 큽니다.");
				else if(computer < user)
					System.out.println(user+" 보다 작습니다.");
				else
				{
					System.out.println("정답입니다. " + count+" 번 시도하였습니다.");
				}
					
				
				
			}while(computer != user);
			
		}
		
		
		/*
		 * 구구단 가로 출력
		 */
		public void 최종실습_1()
		{
			for (int i = 1 ; i <= 9 ; i++) 
			{
				for (int j = 1; j <=3; j++)
				{
					int x=(j+1)+(i-1)/3*3;
					int y= i%3==0 ? 3:i%3;
					
					if(x>=10)
						break;
					
					System.out.print(x+"*" + y+ "="+ x*y+"\t");
				
				}
				System.out.println();
				if(i%3==0)
					System.out.println();
					
			}
		}
		
		
		
		/*
		 * 1부터 100사이 소수 구하기
		 */
		public void 최종실습_2()
		{
			int isPrimeNumber=2;

			for (int i = 1 ; i <= 100 ; i++) 
			{
				for(;isPrimeNumber<i;isPrimeNumber++)
					if(i%isPrimeNumber == 0) // 1과 자기자신외에 수가 나누어 떨어진다면 더 볼것 없이 소수가 아니다.
						break;

				
				if(i==isPrimeNumber)
					System.out.print(i+" ");
				
				isPrimeNumber=2;
			}
		}
		
		
		
		/*
		 * 1, 1 부터 시작하는 피보나치 수열 12번째수
		 */
		public void 최종실습_3()
		{
			int preNumber=0;
			int fibonacci=1;
			int nextNumber=1;
			
			for(int i =0;i<12;i++)
			{
				nextNumber = preNumber+fibonacci;
				
				System.out.print(fibonacci+" ");
				
				preNumber=fibonacci;
				fibonacci = nextNumber;
			}
		}
		
}
