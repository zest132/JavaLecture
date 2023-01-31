package joo;

import java.util.Arrays;
import java.util.Scanner;


class MyMath
{
	int add(int x, int y)
	{
		return x+y;
	}
	
	int subtract(int x, int y)
	{
		return x-y;
	}
	int multiply(int x, int y)
	{
		return x*y;
	}
	
	int divide(int x, int y)
	{
		return x/y;
	}
}

class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int getTotal()
	{
		return kor+eng+math;
	}
	
	int getAverage()
	{
		return kor+eng+math/3;
	}
	
	
}

class Archer
{
	String name;
	int power;
	int hp;
	int armer;
	
	void Attack(Archer target)
	{
		target.hp -= power - target.armer;
	}
	
	
	void showState()
	{
		System.out.print("케릭터명:" + name+"\t");
		System.out.print("공격력:" + power+"\t");
		System.out.print("체력:" + hp+"\t");
		System.out.println("방어력:" + armer+"\t");
		
	}
}


public class 강의6실습문제 {

	
	 
	
		/*
		 * 오른쪽의 클래스를 구현 하여 Main함수 내에서 메서드를 활용하여 아래의 식의 답을 출력하자 500/5+3*27-5
		 */
		public void 문제1_1()
		{
			MyMath math = new MyMath();
			
			int result = math.subtract(math.add(
												math.divide(500, 5)
											  , math.multiply(3, 27)), 5);
			System.out.println(result);
			System.out.println(500/5+3*27-5);
			
			 
			
		}
		
		
		
		
		
		/*
		 * 2. Student 클래스를 구현 후 아래와 같이 출력하자(객체배열활용) 
		 */
		public void 문제1_2()
		{
			Student[] students = new Student[5];
			
			
			System.out.println("국어\t영어\t수학\t합계\t평균");
			for(Student student : students)
			{
				student.kor = (int)(Math.random()*100)+1;
				student.eng = (int)(Math.random()*100)+1;
				student.math = (int)(Math.random()*100)+1;
				
				System.out.println(student.kor
							+"\t"+student.eng
							+"\t"+student.math
							+"\t"+student.getTotal()
							+"\t"+student.getAverage());
			}
				
			
		}
		
		
		/*
		 * Archer 클래스를 구현하여 객체배열 을 이용하여 10개의 객체를 생성 후 서로 공격해보자
		 * (모두 한번씩은 공격을 주고 받아야 한다)
		 */
		public void 문제1_3()
		{
			Archer[] archers = new Archer[10];
			
			int userNumber=0;
			for(Archer archer : archers)
			{
				archer = new Archer();
				archer.name ="유저"+userNumber;
				archer.hp = (int)(Math.random()*100)+1;
				archer.power = (int)(Math.random()*50)+1;
				archer.armer = (int)(Math.random()*10)+1;
				
				archer.showState();
			}
			
			
		
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
		 * 아래의 그림처럼 2차원배열을 오른쪽 방향으로 90도 회전시켜보자
			(한바퀴 도는 과정을 출력하자)
		 */
		public void 최종실습_2()
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
		public void 최종실습_3()
		{
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
