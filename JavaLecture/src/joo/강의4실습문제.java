package joo;

import java.util.Scanner;

public class 강의4실습문제 {

	
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
		
		public void 최종실습_1()
		{
			for (int i = 1 ; i <= 9 ; i++) {
				for (int j = 1; j <= 3; j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3==0? 3 : i%3 ;
				if(x > 9) // 9 . 10 . 단까지만 출력한다 이 코드가 없으면 단까지 출력된다
				break;
				System.out.print(x+"*"+y+"="+x*y+"\t"); //println이 아님에 주의
				}
				System.out.println();
				if(i%3==0) System.out.println(); 
			}
		}
		
		public void 최종실습_2()
		{
			int checkCounter = 30; //소수 출력을 원하는 개수
			boolean isPrimeNumber = false; //검사한 수가 소수일때 true값을 가지는 참/거짓 변수
					
			for(int i = 1; checkCounter > 0 ; i++) { //검사하는 수를 1씩 증가 시키면서 반복한다
				int counter = 0; //검사하는 수의 약수 갯수를 세는 카운터 변수
						
				for(int j = 1; j <= i; j++) { // 1부터 바깥 포문의 i값 까지 ... 1 ~ 1 -> 1 ~ 2순차적으로 계산
					//약수가 존재하면 카운터를 증가시킨다
					if(i % j == 0) counter++;
				}
				//카운터가 2인경우(약수가 2인경우)는 1과 자기자신 인 경우 밖에 없으므로 소수에 해당한다.
				if(counter == 2)isPrimeNumber = true;
				else isPrimeNumber = false;
				
				//소수를 출력하고 소수출력개수카운터를 1감소시킨다.
				if(isPrimeNumber) {
					System.out.print(i+", ");
					checkCounter--;
				}
			}
		}
		
		public void 최종실습_3()
		{
			// Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
			int num1 = 1;
			int num2 = 1;
			int num3 = 0; // 세번째 값
			System.out.print(num1+","+num2);
			for (int i = 0 ; i < 6 ; i++ ) {
			num3 = num1 + num2; // . 세번째 값은 첫번째와 두번째 값을 더해서 얻는다
			System.out.print(","+num3); // 세 번째 수열 출력
			num1 = num2; // . 두 번째 수열을 첫 번째 값으로 한다
			num2 = num3; // . 세 번째 수열을 두 번째 값으로 한다
			}
		}
		
}
