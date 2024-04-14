package joo.강의14;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		List<Book> bookList = new ArrayList();
		
		bookList.add(new Book("해리포터와 비밀의방","조앤 k. 롤링"));
		bookList.add(new Book("해리포터와 아즈카반의죄수","조앤 k. 롤링"));
		bookList.add(new Book("백종원이 추천하는 집밥 메뉴","백종원"));
		bookList.add(new Book("몰입","황농문"));
		
		
		for(Book book : bookList)
		{
			if(book.author.equals("조앤 k. 롤링"))
				System.out.println(book);
			
		}
		
		
		

	}
	
	
	public static void 실습문제1_1()
	{
		People p1 = new People();
		
		p1.hobby = People.HOBBY.BASEBALL;
		System.out.println(p1.hobby);
	}
	
	
	
	public static void 실습문제1_2()
	{
		MyStack<String> stack = new MyStack<>();
		
		stack.push("1번");
		stack.push("2번");
		stack.push("3번");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
	
	
	public static void 실습문제2_1()
	{
		for(int i=0;i<11;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
		
			}catch(Exception ex)
			{
				
			}
		}
		
	}
	
	
	
	public static void 실습문제2_2()
	{
		
		new Thread(new Runnable(){
			 @Override
			public void run() {
				
				for(int i=0;i<10;i++)
				{
					try
					{
						Thread.sleep(1000);
						System.out.println(i);
				
					}catch(Exception ex)
					{
						
					}
					
				}
			}
		 }
		 ).start();

		JOptionPane.showInputDialog("값을 입력하세요");
	}
	
	
	
	public static void 실습문제2_3()
	{
		Thread th = new Thread(new Runnable(){
			 @Override
			public void run() {
				 int i=0;
				while(true)
				{
					try
					{
						Thread.sleep(1000);
						System.out.println(i);
						i++;
					}catch(Exception ex)
					{
						
					}
					
				}
			}
		 }
		 );
		 
		th.setDaemon(true);
		th.start();
		JOptionPane.showInputDialog("값을 입력하세요");
	}
	

	
	public static void 쓰레드예제()
	{
		
	}
	
	public static void 열거형()
	{
		System.out.println(Student.STATE.RUNNING.value);
		System.out.println(Student.STATE.SLEEPING.value);
		System.out.println(Student.STATE.STUDYING.value);
		System.out.println(Student.STATE.EATING.value);
		
	}

}
