package joo;

import java.util.Arrays;
import java.util.Scanner;

public class 강의5실습문제 {

	
		/*
		 * 1. int 타입 길이5의 배열을 만들어 임의의 값을 넣어 평균을 구해보자.
		 */
		public void 문제1_1()
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
    		(값은 Math.random() 을 이용하여 넣자)
		 */
		public void 문제1_2()
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
		public void 문제1_3()
		{
			int[] arr = new int[10];
			
			for(int i = 0 ;i<arr.length; i++)
				arr[i] = (int)(Math.random()*10);

			
			System.out.println("정렬전: "+ Arrays.toString(arr));

			
			for(int i = 0 ;i<arr.length-1; i++)
				for(int j =0;j<arr.length-1-i;j++)
					if(arr[j] >arr[j+1])
					{
						int temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
					}
			
			
			System.out.println("정렬후: "+ Arrays.toString(arr));
		}
		
		
		/*
		 * 학생 5명의 국어, 영어, 수학 성적을 저장하는 2차원 배열을 만들어 저장하고 각 학생의 평균을 출력하여 보자
		 * (길이3의 1차원배열 5개를 저장해야한다)
		 */
		public void 문제2_1()
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
		public void 문제2_2()
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
		public void 문제2_3()
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
		public void 최종실습_1()
		{
			char[][] arr = new char[5][5];
			
			for(int y=0;y<arr.length;y++)
				for(int x=0;x<arr.length;x++)
					arr[y][x]=' ';
			
			
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
