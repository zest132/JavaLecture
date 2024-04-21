package joo.강의14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		String str = JOptionPane.showInputDialog("값을 입력하세요");
		
		System.out.println("서버와 통신주고 받기");

		

	}
	
	

	
	public static void HashMap예제()
	{
		Map<String,String> map = new HashMap();
		
		map.put("사과", "apple");
		map.put("자동차", "car");
		map.put("책", "book");
		map.put("음식", "food");
		map.put("사과", "apple");
		
		
	
		
		System.out.println(map);//toString이 오버라이딩 되어 있다.
		System.out.println(map.get("음식"));//key를 통해 하나의 value를 가져온다.
		
		map.remove("사과"); //key를 통해 요소를 삭제한다.
		System.out.println(map);
		
		//모든 요소를 순회하며 꺼내올때는 향상된 for문을 이용하고 Set형태로 변환하여 가져온다.
		 for (Map.Entry<String, String> entry : map.entrySet()) 
		 {
	        System.out.println("key:"+entry.getKey() +"\t value:"+ entry.getValue());
	     }
		 
		 
		 
		 
		 
		
	}
	
	
	public static void 실습문제1_1()
	{
		People p1 = new People();
		
		p1.hobby = People.HOBBY.BASEBALL;
		System.out.println(p1.hobby);
	}
	
	public static void 실습문제2_1()
	{
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
	
	
	public static void 실습문제2_2()
	{
		WordCount wc = new WordCount();
		
		wc.add("강아지");
		wc.add("복숭아");
		wc.add("밀키트");
		wc.add("자전거");
		wc.add("운동화");
		wc.add("강아지");
		wc.add("강아지");
		wc.add("운동화");
		
		System.out.println(wc.getWordCount("강아지"));
		
		wc.printAllWordCount();
	}
	
	
	public static void 실습문제2_3()
	{
		MyStack<String> stack = new MyStack<>();
		
		stack.push("1번");
		stack.push("2번");
		stack.push("3번");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
	
	
	public static void 실습문제3_1()
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
	
	
	
	public static void 실습문제3_2()
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
	
	
	
	public static void 실습문제3_3()
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
	

	public static void ArrayList예제()
	{
		List<String> list = new ArrayList();
		
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		
		System.out.println(list.size());//요소의 갯수를 반환한다.
		System.out.println(list);//요소들을 출력할수 있게 toString()이 오버라이딩 되어 있다.
		list.remove(2); //임의 위치의 요소를 삭제할수 있다.그 뒤의 요소들의 index번호는 자동으로 당겨진다.
		System.out.println(list);//삭제후의 요소들을 확인해볼수 있다.
		System.out.println(list.indexOf("나")); //해당 요소의 위치를 반환한다.
		
		if(list.contains("나")) //해당데이터가 요소에 있는지 여부만을 반환한다. indexOf 보다 빠르다.
			System.out.println("'나' 가 요소에 포함되어 있습니다.");
		
		list.add(0,"마"); //임의 위치에 요소 삽입
		System.out.println(list); //삽입후의 요소들을 확인
		System.out.println(list.lastIndexOf("라"));//뒤에서 부터 탐색한다.
		
		//Collections 클래스의 sort메서드의 매개변수로 List의 자식 객체를 넘겨주면 오름차순으로 정렬해준다.
		Collections.sort(list);
		
		System.out.println(list);//정렬된 것을 확인
		
		
	}

	
	public static void 열거형()
	{
		System.out.println(Student.STATE.RUNNING.value);
		System.out.println(Student.STATE.SLEEPING.value);
		System.out.println(Student.STATE.STUDYING.value);
		System.out.println(Student.STATE.EATING.value);
		
	}

}
