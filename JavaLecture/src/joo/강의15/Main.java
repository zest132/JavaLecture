package joo.강의15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;



public class Main {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{

			OutputStream fos = new FileOutputStream("C:\\Users\\zest1\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의15\\test.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//fos.write("파일로 출력".getBytes());
			//fos.close();
			bos.write("파일로 출력".getBytes());
			bos.close();
	
	
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	
		
	}

}
