package joo.강의15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

import org.json.JSONArray;
import org.json.JSONObject;


public class Main {

	
	
	
	public static void main(String[] args) {
		
		//객체는 JSONObject  ,JSONArray
		//기본형, 객체, 배열
		//get() , getJSONObject() , getJSONArray()
		
		String data = "{이름:홍길동 , 친구:{이름:김길동,나이:10} , 취미:[먹기,축구,당구]}";
		JSONObject json = new JSONObject(data);
		
		System.out.println(json.get("이름").toString());
		
		JSONObject f = json.getJSONObject("친구");
		System.out.println(f.get("이름"));
		
		JSONArray hobby = json.getJSONArray("취미");
		
		String temp = hobby.get(1).toString();
		System.out.println(temp);
		
		/*
		
		
		data="[단일데이터,{이름:홍길동, 나이:29},[1,2,3]]";
		JSONArray jsonarr = new JSONArray(data);
		
		
		
	
		System.out.println(jsonarr);
		
		*/

		
		
		/*
		
		String str = "{\"id\":\"chatcmpl-6vX5cfe1VRa29F7AzS8kBmYjbh4In\",\"object\":\"chat.completion\",\"created\":1679169912,\"model\":\"gpt-3.5-turbo-0301\",\"usage\":{\"prompt_tokens\":11,\"completion_tokens\":32,\"total_tokens\":43},\"choices\":[{\"message\":{\"role\":\"assistant\",\"content\":\"하세요! 저는 AI 어시스턴트입니다. 어떤 도움이 필요하신가요?\"},\"finish_reason\":\"stop\",\"index\":0}]}";
		
		JSONObject obj = new JSONObject("{\"취미\":[\"야구\",\"게임\"]}"); 
		//value가 배열일때 getJSONArray 를 사용한다.
		//["야구","게임"] 에서 get(0)은 배열의 첫번째 값을 가져온다는것이다.
		String result =obj.getJSONArray("취미").get(0).toString();
		System.out.println(result);
		
		JSONArray arr = new JSONArray("[{\"이름\":\"박주병\"},{\"이름\":\"홍길동\"}]"); 
		//value가 배열이고 배열의 요소가 객체일때
		result =arr.getJSONObject(1).get("이름").toString();
		System.out.println(result);
		
		*/
		
	}
	
	public static  void 바이트기반Input예제()
	{
		try
		{
			File file = new File("C:\\Users\\USER545\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\test.txt");

			InputStream stream = new FileInputStream(file);
			
			
			int data=0;
			
			while((data=stream.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			stream.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	
	public static  void 바이트기반Output예제()
	{
		try
		{
			File file = new File(
			"C:\\Users\\USER545\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\test.txt");

			OutputStream stream = new FileOutputStream(file);
			
			stream.write('a');
			
			stream.write(104);
			
			stream.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public static  void 바이트기반BufferedInput예제()
	{
		try
		{
			File file = new File("C:\\Users\\USER545\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\test.txt");

			InputStream stream = new FileInputStream(file);
			BufferedInputStream bStream = new BufferedInputStream(stream); //스트림 객체를 버퍼로 한번 감싼다.
			
			int data=0;
			
			while((data=bStream.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			bStream.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	
	public static  void 바이트기반BufferedOutput예제()
	{
		try
		{
			File file = new File("C:\\Users\\USER545\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\test.txt");

			OutputStream stream = new FileOutputStream(file);
			BufferedOutputStream bStream = new BufferedOutputStream(stream); //스트림 객체를 버퍼로 한번 감싼다.
			
			
			bStream.write("출력합니다!1".getBytes());
			bStream.write("출력합니다!2".getBytes());
			bStream.write("출력합니다!3".getBytes());
			bStream.write("출력합니다!4".getBytes());
			bStream.write("출력합니다!5".getBytes());
			bStream.write("출력합니다!6".getBytes());

			stream.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public static void 바이트VS문자기반스트림비교()
	{
		try
		{
			File file = new File("C:\\Users\\zest1\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\test.txt");

			InputStream stream = new FileInputStream(file);
			FileReader stream2 = new FileReader(file);
			
			
			int data=0;
			//바이트 기반 읽기
			while((data=stream.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			System.out.println();
			
			//문자열 기반 읽기
			while((data=stream2.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			
			stream.close();
			stream2.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public static void 문자기반스트림예제()
	{
		try
		{
			File file = new File("C:\\Users\\zest1\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\test.txt");
			File copyFile = new File("C:\\Users\\zest1\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\test_copy.txt");
			
			FileReader reader = new FileReader(file);
			FileWriter writer = new FileWriter(copyFile);
			
			
			int data=0;

			//문자열 기반 읽기
			while((data=reader.read()) != -1)
			{
				System.out.print((char)data);
				
				writer.write(data);
			}
			
			
			reader.close();
			writer.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public static void 실습문제1_1()
	{
		try
		{
			File file = new File("C:\\Users\\USER545\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\original.txt");

			InputStream stream = new FileInputStream(file);
				
			int data=0;
			
			while((data=stream.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			stream.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	

	
	public static void 실습문제1_2()
	{
		try
		{
			
			String path = "C:\\Users\\USER545\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15";
			File originalFile = new File(path+"\\original.txt");
			File copyFile = new File(path+"\\original_copy.txt");
	
			
			InputStream stream = new FileInputStream(originalFile);
			OutputStream outStream = new FileOutputStream(copyFile);
				
			int data=0;
			
			while((data=stream.read()) != -1)
			{
				outStream.write(data);
			
			}
			
			
			stream.close();
			outStream.close();
	
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public static void 실습문제1_3()
	{
		try
		{
			
			String path = "C:\\Users\\zest1\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15";
			File originalFile = new File(path+"\\짱구.jpg");
			File copyFile = new File(path+"\\짱구_copy.jpg");
	
			
			InputStream stream = new FileInputStream(originalFile);
			OutputStream outStream =  new FileOutputStream(copyFile);
				
			int data=0;
			
			while((data=stream.read()) != -1)
			{
				outStream.write(data);
			
			}
			
			
			stream.close();
			outStream.close();
	
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	
	public static void 실습문제1_4()
	{
		try
		{
			
			String path = "C:\\Users\\zest1\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15";
			File originalFile = new File(path+"\\짱구.jpg");
			File copyFile = new File(path+"\\짱구_copy.jpg");
	
			
			InputStream stream = new BufferedInputStream(new FileInputStream(originalFile));
			OutputStream outStream = new BufferedOutputStream(new FileOutputStream(copyFile));
				
			int data=0;
			
			while((data=stream.read()) != -1)
			{
				outStream.write(data);
			
			}
			
			
			stream.close();
			outStream.close();
	
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
