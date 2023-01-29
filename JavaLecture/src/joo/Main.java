package joo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
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

	
	
}
