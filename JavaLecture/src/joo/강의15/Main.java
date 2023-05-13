package joo.강의15;

import java.io.*;



public class Main {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stream.write("파일로 출력".getBytes());
		//bos.write("파일로 출력".getBytes());
		//bos.close();
		
		실습문제1_2();
		
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
}
