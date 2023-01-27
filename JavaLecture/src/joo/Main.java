package joo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
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

	
	
}
