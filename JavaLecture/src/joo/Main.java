package joo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
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
		Scanner scan = new Scanner(System.in);
		
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
