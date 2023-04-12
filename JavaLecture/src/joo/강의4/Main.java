package joo.강의4;

import java.util.Scanner;

import joo.Util;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		실습문제4_1();

	
	}
	
	
	public static void 실습문제1_1()
	{
		for(int i =0;i<=5;i++)
			System.out.print(i);
		
		
		System.out.println();
		
		for(int i =1;i<=5;i++)
			System.out.println(i);
	}
	
	public static void 실습문제1_2()
	{
		int sum = 0;
		
		for(int i=0; i<=10;i++)
		{
			sum += i;
			System.out.println("1부터"+i+"까지의 합:"+sum);
		}
		
	}
	
	public static void 실습문제1_3()
	{
		int max =10;
		
		for(int i=0;i<=max;i++)
		{
			System.out.println(i +" "+(max-i));
		}
		
		
	}
	
	public static void 실습문제1_4()
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
	
	public static void 실습문제1_5()
	{
		for(int i = 2 ;i<9; i++)
		{
			for(int j = 1 ;j<=9; j++)
			{
				System.out.println(i+" x " +j +" = "+ i*j);
			}
		}
		
		
	}
	
	public static void 실습문제1_6()
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
	
	
	public static void 실습문제2_1()
	{
		int i=1;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
	}
	
	public static void 실습문제2_2()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		int number =scan.nextInt();
		

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
	
	public static void 실습문제2_3()
	{
		
		int sum = 0;
		
		int i=0;
		while(sum<150)
		{
			sum +=++i;
			System.out.println("누적 합계:"+sum+ "  현재 숫자 : "+i);
		}
		
	}
	
	public static void 실습문제3_1()
	{
		int i=0;
		
		do
		{
			if(i%2==0)
				System.out.println(i);
			
			
			i++;
		}while(i<=10);
		
	}
	
	public static void 실습문제3_2()
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
	
	public static void 실습문제4_1()
	{
		int isPrimeNumber;

		for (int i = 1 ; i <= 100 ; i++) 
		{
			for(isPrimeNumber=2;isPrimeNumber<i;isPrimeNumber++)
				if(i%isPrimeNumber == 0) // 1과 자기자신외에 수가 나누어 떨어진다면 더 볼것 없이 소수가 아니다.
					break;

			
			if(i==isPrimeNumber)
				System.out.print(i+" ");
			
			
		}
	}
	
	public static void 실습문제4_2()
	{
		for (int i = 1 ; i <= 9 ; i++) 
		{
			for (int j = 2; j <=4; j++)
			{
				int x=j+(i-1)/3*3;
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
	
	
	
	public static void 실습문제4_3()
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
