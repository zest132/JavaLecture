package joo.강의5;

import java.util.Arrays;
import java.util.Scanner;

import joo.Util;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int[][] score = new int [5][];
		
		

	
	}
	
	
	/*
	 * 1. int 타입 길이5의 배열을 만들어 임의의 값을 넣어 평균을 구해보자.
	 */
	public static void 실습문제1_1()
	{
		int[] arr = {10,20,30,40,50};
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int sum=0;
		
		for(int i = 0 ;i<arr.length; i++)
			sum +=arr[i];
		
		
		System.out.println(sum/(float)arr.length);
	}
	
	
	
	/*
	 * int 타입 길이 10의 배열을 만들어 임의의 값을 넣고 최대값과 최소값을 출력하자
	 */
	public static void 실습문제1_2()
	{
		int[] arr = {5,478,41,2,45,758,14,3,97,10};
		
		int max,min;
		
		max = arr[0];
		min = arr[0];
				
		for(int i = 1 ;i<arr.length; i++)
		{
			if(max<arr[i]) max =arr[i];
			
			if(min>arr[i]) min =arr[i];

		}
		
		System.out.println("최대값은 " +max);
		System.out.println("최소값은 " +min);
	}
	

	/*
	 * int타입 길이10의 배열에 0~9 까지의 랜덤한값을 넣은후 오름차순으로 정렬하여보자
	 */
	public static void 실습문제1_3()
	{
		int count=0;
		int[] arr = new int[10];
		
		for(int i = 0 ;i<arr.length; i++)
			arr[i] = (int)(Math.random()*10);

		
		System.out.println("정렬전: "+ Arrays.toString(arr));

		
		for(int i = 0 ;i<arr.length-1; i++)
			for(int j =0;j<arr.length-1-i;j++)
			{
				count++;
				if(arr[j] >arr[j+1])
				{
					
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
				
		
		
		System.out.println("정렬후: "+ Arrays.toString(arr));
		
		System.out.println("연산횟수:"+ count);
	}
	
	/*
	 * 학생 5명의 국어, 영어, 수학 성적을 저장하는 2차원 배열을 만들어 저장하고 각 학생의 평균을 출력하여 보자
	 * (길이3의 1차원배열 5개를 저장해야한다)
	 */
	public static void 연습문제2_1()
	{
		int[][] score = new int [][] {
			{30,50,30}
			,{70,20,90}
			,{100,80,70}
			,{90,40,30}
			,{10,40,100}
		}
		;
		System.out.println("국어 \t영어 \t수학 \t평균");
		for(int[] student : score)
		{
		int sum = 0;
		
		for(int i : student)
		{
		sum += i;
		System.out.print(i+" \t");
		
		}
		
		System.out.print(sum/student.length);
		
		
		System.out.println();
		}
		
	}
	
	/*
	 * 2차원배열을 이용하여 숫자를 입력받아 암호화 하는 프로그램을 만들자.
	 */
	public static void 연습문제2_2()
	{
		
		char[][] encryptGrid = {{'0',')'}
								,{'1','!'}
								,{'2','@'}
								,{'3','#'}
								,{'4','$'}
								,{'5','%'}
								,{'6','^'}
								,{'7','&'}
								,{'8','*'}
								,{'9','('}
								};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("암호화할 숫자를 입력하세요 : ");
		String input = scan.nextLine();
		//사용자로 부터 받은 숫자
		char[] plainText = input.toCharArray();
		//암호화된 숫자를 저장하기 위한 배열
		char[] encryptText = new char[plainText.length];
		
		
		System.out.print("평문 : ");
		System.out.println(plainText);
		for(int i =0;i<plainText.length;i++)
		{
		for(char[] temp :encryptGrid)
		{
			//같은 문자라면 암호화된걸로 교체 한다.
			if(temp[0] == plainText[i])
				encryptText[i] = temp[1];
		}
		}
		
		System.out.print("암호화 : ");
		System.out.println(encryptText);
		
		
		
		
	}
	
	/*
	 *  1~25까지 숫자를 저장하는 2차원행렬을 만든후 값을 랜덤하게 섞어보자 (Math.random() 이용

	 */
	public static void 연습문제2_3()
	{
		
		int[][] arr = new int[5][5];
		
		System.out.println("---셔플전---");
		for(int i=0;i<arr.length;i++)
		{
			for(int j =0;j<arr[0].length;j++)
			{
				arr[i][j] = i*arr[0].length+(j+1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
			
		System.out.println("---------");
		
		
		
		//숫자 셔플
		for(int shuffleCnt=0;shuffleCnt<100;shuffleCnt++)
		{
			int randomNumber = (int)(Math.random()*25)+1;
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j =0;j<arr[0].length;j++)
				{
					//랜덤수와 동일한 숫자를 찾으면
					if(arr[i][j] == randomNumber)
					{
						//0,0 의 숫자와 바꿔서 섞는다.
						int temp = arr[i][j];
						arr[i][j] = arr[0][0];
						arr[0][0] = temp;
						break;
					}
				}
					
					
			}
		}
		
		
		System.out.println("---셔플후---");
		for(int i=0;i<arr.length;i++)
		{
			for(int j =0;j<arr[0].length;j++)
			{
			
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		
	}
	
	
	/*
	 * 좌표를 입력받아 해당좌표에 x를 표시하자
	 */
	public static void 실습문제3_1()
	{
		char[][] arr = new char[][]{
									{' ',' ',' ',' ',' '},
									{' ',' ',' ',' ',' '},
									{' ',' ',' ',' ',' '},
									{' ',' ',' ',' ',' '},
									{' ',' ',' ',' ',' '}
									};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("좌표를 입력하세요:");
		int pos = scan.nextInt();
		//입력한 좌표에 x 저장
		arr[(pos/10)-1][(pos%10)-1] = 'X';
		
		
				
				
		System.out.println(" 12345");
		
		for(int y=0;y<arr.length;y++)
		{
			System.out.print(y+1);
			for(int x=0;x<arr.length;x++)
			{
				System.out.print(arr[y][x]);
				
			}
			System.out.println();
		}
	}
	
	
	/*
	 * 아래의 그림처럼 2차원배열을 오른쪽 방향으로 90도 회전시켜보자
		(한바퀴 도는 과정을 출력하자)
	 */
	public static void 실습문제3_2()
	{
		char[][] star = {
				 {'*','*',' ',' ',' '}
				,{'*','*',' ',' ',' '}
				,{'*','*','*','*','*'}
				,{'*','*',' ',' ',' '}
				,{'*','*',' ',' ',' '}
				};
				char[][] result = new char[star[0].length][star.length];
				for(int i=0; i < star.length;i++) 
				{
					for(int j=0; j < star[i].length;j++)
						System.out.print(star[i][j]);
				
					System.out.println();
				}
				
				System.out.println();
				for(int i=0; i < star.length;i++) 
				{
					for(int j=0; j < star[i].length;j++) 
					{
						int x = j;
						int y = star.length-1-i;
						result[x][y]=star[i][j];
					}
				}
				for(int i=0; i < result.length;i++)
				{
					for(int j=0; j < result[i].length;j++) 
					{
						System.out.print(result[i][j]);
					}
				System.out.println();
				}

	}
	
	/*
	 * 1~25 사이의 셔플 2차원 배열[5][5]을 만든후 사용자로부터 좌표를 입력받아 해당좌표의 숫자를 공개하고 공개된숫자가 13일 경우 게임을 종료한다.
	(힌트: 해당좌표의 공개여부를 저장하기위해 셔플된 2차원배열[5][5]을 2개 가지는 3차원 배열을 만들어야 한다!)
	 */
	public static void 실습문제3_3()
	{
		
		Scanner scan = new Scanner(System.in);
		
		//[1][][] -> 공개여부 저장 [0][][] -> 데이터
		// arr[1][0][0] = 1   -> 0,0 좌표는 공개
		int[][][] arr = new int[2][5][5];
					
		//1~25 순차 입력	
		for(int i=0;i<arr[0].length;i++)
			for(int j =0;j<arr[0][0].length;j++)
				arr[0][i][j] = i*arr[0][0].length+(j+1);


		//숫자 셔플
		for(int shuffleCnt=0;shuffleCnt<100;shuffleCnt++)
		{
			int randomNumber = (int)(Math.random()*25)+1;
			
			for(int i=0;i<arr[0].length;i++)
				for(int j =0;j<arr[0][0].length;j++)
					if(arr[0][i][j] == randomNumber)//랜덤수와 동일한 숫자를 찾으면
					{
						//0,0 의 숫자와 바꿔서 섞는다.
						int temp = arr[0][i][j];
						arr[0][i][j] = arr[0][0][0];
						arr[0][0][0] = temp;
						break;
					}
		}
		
		
		while(true)
		{
			System.out.println("좌표를 입력하여 숫자 15를 찾으시오.:");
			int input = scan.nextInt();
			//해당좌표의 공개여부를 1로 바꾸어 공개로 설정한다.
			arr[1][input%10][input/10] = 1;
			
			
			System.out.println("-------------------------------");
			for(int i=0;i<arr[0].length;i++)
			{
				for(int j =0;j<arr[0][0].length;j++)
				{
					//공개로 설정되어 있으면 숫자를 공개한다
					if(arr[1][i][j] == 1)
						System.out.print(arr[0][i][j] + "\t");
					else//아니면 별표 표시한다.
						System.out.print("*\t");
		
				}
				System.out.println();
			}
			
			System.out.println("-------------------------------");
			
			if(arr[0][input%10][input/10] ==15)
			{
				System.out.println("정답입니다.");
				break;
			}
			
		}
	}
}
