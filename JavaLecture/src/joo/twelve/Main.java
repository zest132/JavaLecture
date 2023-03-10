package joo.twelve;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a =10/0;
			
			try
			{
				System.out.println("try catch 중첩 사용가능");
			}catch(Exception ex)
			{
				
			}
			
		}catch(NullPointerException ex)
		{
			try
			{
				System.out.println("try catch 중첩 사용가능");
			}catch(Exception ex)
			{
				
			}
			System.out.println("객체를 생성하고 쓰세요");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("0으로 나누지 마세요 ㅡㅡ");
		}
			
	
		
		

		
		
	}

}
