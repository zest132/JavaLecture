package joo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		
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
	

	
	
}
