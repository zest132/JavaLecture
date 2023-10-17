package joo.강의16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.json.JSONObject;


class Repair
{
	
}

class test
{
	void repair(Repair unit)
	{
		
	}
}


public class Main {

	public static void main(String[] args) {
		
		실습문제1_12();
		
	}
	
	
	public static void 기본예제()
	{
		try
		{
			String key = "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";
			
			//URL주소를 객체화하는 클래스
			URL url = new URL("https://api.openai.com/v1/chat/completions");
			
			//객체화한 url을 통해 http통신을 위한 객체를 생성한다.메서드 방식은 POST 이다.
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			//http 통신시 데이터 형태는 json이라고 선언
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			//발급받은 키값을 넣어준다.
			con.setRequestProperty("Authorization","Bearer "+key);
			//chatGPT의 대답이 느릴경우 기다려주는 타임을 설정
			con.setRequestProperty("Retry-After","3600");
			//데이터 전송을 위해 true로 설정해야 한다.
			con.setDoOutput(true);
		
	
		
			//http 통신시 데이터를 서버에 전송하기 위해 스트림을 연다( 스트림이란 데이터가 왔다갓다 하는 통로이다)
			OutputStream out = con.getOutputStream();

			//chatGPT로 보낼 메시지
			String msg = "만나서 반가워";

			//json 형태로 되어있고 모델 정보와 메시지 정보가 들어가 있다.
			//chatGPT가 했던 대답은 role 이 assistant 이여야 한다.
			//예제 -> messages\":[{\"role\":\"user\",\"content\":\"안녕\"},{\"role\":\"assistant\",\"content\":\"chatGPT의 대답\"}]
			String json = "{\"model\": \"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\""+msg+"\"}]}";
			
			//문자열을 보내기전에 utf-8 형태로 인코딩을 변환하고 바이트로 변경한다.
			byte[] inputBytes = json.getBytes("utf-8");
			//스트림으로 바이트로된 메시지를 전달한다.
			out.write(inputBytes);
		
			
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
			con.getResponseCode();
			//chatGPT가 보내온 응답을 받기 위해 InputStream을 열고 버퍼를 통해 받아온다.
			//InputStreamReader 클래스는 바이트기반스트림을 문자기반스트림으로 변환해준다.
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		
			//응답을 저장할 String 변수이다.
			StringBuilder response = new StringBuilder();
			String responseLine  = null;
			
			//버퍼로 부터 데이터를 가져온다.readLine()은 문자열에서 개행이 있는부분까지 한번에 가져온다.
			//더이상 가져올 문자가 없다면 null이 반환된다.
			while((responseLine = br.readLine()) != null)
			{
				//trim은 공백을 제거 하는 메서드 이다. 
				//chatGPT 테스트 결과 가끔 응답에 공백을 많이 넣어준다. 
				//대답이 길경우 성능향상을 위해 StringBuilder를 사용했다.
				response.append(responseLine.trim());
			}
			
			//chatGPT로 부터 받은 JSON 데이터를 파싱하여 대답 부분만 추출한다.
			JSONObject obj = new JSONObject(response.toString()); 
			String result =obj.getJSONArray("choices")
							  .getJSONObject(0)
							  .getJSONObject("message")
							  .get("content").toString();
			  
			//응답을 출력한다.
			System.out.println(result);
			
			out.close();
			br.close();
		}catch(Exception ex)
		{
			
		}
	}
	
	public static void 실습문제1_2()
	{
		String key = "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";
		
		ChatGPT gpt = new ChatGPT(key);
		
		try
		{
			
			HttpURLConnection con = gpt.connect();
	
			//http 통신시 데이터를 서버에 전송하기 위해 스트림을 연다( 스트림이란 데이터가 왔다갓다 하는 통로이다)
			OutputStream out = con.getOutputStream();

			//chatGPT로 보낼 메시지
			String msg = "만나서 반가워";

			//json 형태로 되어있고 모델 정보와 메시지 정보가 들어가 있다.
			//chatGPT가 했던 대답은 role 이 assistant 이여야 한다.
			//예제 -> messages\":[{\"role\":\"user\",\"content\":\"안녕\"},{\"role\":\"assistant\",\"content\":\"chatGPT의 대답\"}]
			String json = "{\"model\": \"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\""+msg+"\"}]}";
			
			//문자열을 보내기전에 utf-8 형태로 인코딩을 변환하고 바이트로 변경한다.
			byte[] inputBytes = json.getBytes("utf-8");
			//스트림으로 바이트로된 메시지를 전달한다.
			out.write(inputBytes);
		
			
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
			con.getResponseCode();
			//chatGPT가 보내온 응답을 받기 위해 InputStream을 열고 버퍼를 통해 받아온다.
			//InputStreamReader 클래스는 바이트기반스트림을 문자기반스트림으로 변환해준다.
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		
			//응답을 저장할 String 변수이다.
			StringBuilder response = new StringBuilder();
			String responseLine  = null;
			
			//버퍼로 부터 데이터를 가져온다.readLine()은 문자열에서 개행이 있는부분까지 한번에 가져온다.
			//더이상 가져올 문자가 없다면 null이 반환된다.
			while((responseLine = br.readLine()) != null)
			{
				//trim은 공백을 제거 하는 메서드 이다. 
				//chatGPT 테스트 결과 가끔 응답에 공백을 많이 넣어준다. 
				//대답이 길경우 성능향상을 위해 StringBuilder를 사용했다.
				response.append(responseLine.trim());
			}
			
			//chatGPT로 부터 받은 JSON 데이터를 파싱하여 대답 부분만 추출한다.
			JSONObject obj = new JSONObject(response.toString()); 
			String result =obj.getJSONArray("choices")
							  .getJSONObject(0)
							  .getJSONObject("message")
							  .get("content").toString();
			  
			//응답을 출력한다.
			System.out.println(result);
			
			out.close();
			br.close();
		}catch(Exception ex)
		{
			
		}
	}
	
	
	/**
	 * send() 메서드 생성
	 */
	public static void 실습문제1_3()
	{
		String key = "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";
		
		ChatGPT gpt = new ChatGPT(key);
		
		try
		{
			
			HttpURLConnection con = gpt.connect();
	
			//http 통신시 데이터를 서버에 전송하기 위해 스트림을 연다( 스트림이란 데이터가 왔다갓다 하는 통로이다)
			OutputStream out = con.getOutputStream();

			gpt.send(out, "안녕하세요");
		
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
			con.getResponseCode();

			
			//chatGPT가 보내온 응답을 받기 위해 InputStream을 열고 버퍼를 통해 받아온다.
			//InputStreamReader 클래스는 바이트기반스트림을 문자기반스트림으로 변환해준다.
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		
			//응답을 저장할 String 변수이다.
			StringBuilder response = new StringBuilder();
			String responseLine  = null;
			
			//버퍼로 부터 데이터를 가져온다.readLine()은 문자열에서 개행이 있는부분까지 한번에 가져온다.
			//더이상 가져올 문자가 없다면 null이 반환된다.
			while((responseLine = br.readLine()) != null)
			{
				//trim은 공백을 제거 하는 메서드 이다. 
				//chatGPT 테스트 결과 가끔 응답에 공백을 많이 넣어준다. 
				//대답이 길경우 성능향상을 위해 StringBuilder를 사용했다.
				response.append(responseLine.trim());
			}
			
			//chatGPT로 부터 받은 JSON 데이터를 파싱하여 대답 부분만 추출한다.
			JSONObject obj = new JSONObject(response.toString()); 
			String result =obj.getJSONArray("choices")
							  .getJSONObject(0)
							  .getJSONObject("message")
							  .get("content").toString();
			  
			//응답을 출력한다.
			System.out.println(result);
			
			out.close();
			br.close();
		}catch(Exception ex)
		{
			
		}
	}
	
	
	/*
	 * receive 메서드 생성
	 */
	public static void 실습문제1_4()
	{
		String key = "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";
		
		ChatGPT gpt = new ChatGPT(key);
		
		try
		{
			
			HttpURLConnection con = gpt.connect();
	
			//http 통신시 데이터를 서버에 전송하기 위해 스트림을 연다( 스트림이란 데이터가 왔다갓다 하는 통로이다)
			OutputStream out = con.getOutputStream();

			gpt.send(out, "안녕하세요");
		
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
			con.getResponseCode();
			
			
			String response = gpt.receive(con.getInputStream());

			
			//chatGPT로 부터 받은 JSON 데이터를 파싱하여 대답 부분만 추출한다.
			JSONObject obj = new JSONObject(response.toString()); 
			String result =obj.getJSONArray("choices")
							  .getJSONObject(0)
							  .getJSONObject("message")
							  .get("content").toString();
			//응답을 출력한다.
			System.out.println(result);
	
		}catch(Exception ex)
		{
			
		}
	}
	
	public static void 실습문제1_5()
	{
		String key = "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";
		
		ChatGPT gpt = new ChatGPT(key);
		
		try
		{
			
			HttpURLConnection con = gpt.connect();
	
			//http 통신시 데이터를 서버에 전송하기 위해 스트림을 연다( 스트림이란 데이터가 왔다갓다 하는 통로이다)
			OutputStream out = con.getOutputStream();

			gpt.send(out, "안녕하세요");
		
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
			con.getResponseCode();
			
			
			String response = gpt.receive(con.getInputStream());

			String result = gpt.parseJsonMsg(response);
			//응답을 출력한다.
			System.out.println(result);
	
		}catch(Exception ex)
		{
			
		}
	}
	
	
	
	
	public static void 실습문제1_6()
	{
		
		String key = "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";
		
		ChatGPT gpt = new ChatGPT(key);
		
		try
		{
			
			gpt.connect();
			gpt.send("안녕하세요");
		
			String response = gpt.receive();

			String result = gpt.parseJsonMsg(response);
			//응답을 출력한다.
			System.out.println(result);
	
		}catch(Exception ex)
		{
			
		}
		
	}
	
	public static void 실습문제1_7()
	{
		
		String key = "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";
		
		ChatGPT gpt = new ChatGPT(key);
		
		try
		{
			
			gpt.connect();
			gpt.send("안녕하세요");
			String response = gpt.receive();
			
			//응답을 출력한다.
			System.out.println(response);
	
		}catch(Exception ex)
		{
			
		}
		
	}
	
	public static void 실습문제1_8()
	{
		
		String key = "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";
		
		ChatGPT gpt = new ChatGPT(key);
		
		try
		{
			gpt.connect();
			Scanner scan = new Scanner(System.in);
			
			System.out.print("나: ");
			String msg = scan.next();
			
			gpt.send(msg);
			String response = gpt.receive();
			
			
			//응답을 출력한다.
			System.out.println("AI:"+response);
	
		}catch(Exception ex)
		{
			
		}
		
	}
	
	
	/*
	 * 
	 * 대화 무한반복 
	 * */
	public static void 실습문제1_9()
	{
		
		String key = "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";
		ChatGPT gpt = new ChatGPT(key);
		try
		{
			
			while(true)
			{
				
				
				Scanner scan = new Scanner(System.in);
				
				System.out.print("나: ");
			
				String msg = scan.nextLine();
				
				if(msg.equals("대화종료"))
					break;
				
				gpt.connect();
				gpt.send(msg);
				String response = gpt.receive();
				
				//응답을 출력한다.
				System.out.println("AI:"+response);
			}	
	
		}catch(Exception ex)
		{
			
		}
		
	}
	
	public static void 실습문제1_10()
	{
		//사용하는쪽의 코드 변화는 없어 1_9와 동일하다.
	}
	
	public static void 실습문제1_11()
	{
		String key = "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";
		ChatGPT gpt = new ChatGPT(key);
		try
		{
			
			while(true)
			{
				Scanner scan = new Scanner(System.in);
				
				System.out.print("나: ");
				
			
				String msg = scan.nextLine();
				
				if(msg.equals("대화종료"))
					break;
				
				
				gpt.connect("https://api.openai.com/v1/chat/completions");
				gpt.send(msg);
				String response = gpt.receive();
				
				//응답을 출력한다.
				System.out.println("AI:"+response);
			}	
	
		}catch(Exception ex)
		{
			
		}
	}
	
	
	public static void 실습문제1_12()
	{
		try
		{
			String connectionInfoPath = "C:\\Users\\USER545\\git\\JavaLecture\\JavaLecture\\src\\joo\\강의16\\chatGPTConnectionInfo.txt";
			BufferedReader fileReader = new BufferedReader(new FileReader(connectionInfoPath));
			
			String data;
			HashMap map = new HashMap();
			while((data = fileReader.readLine()) != null)
			{
				String[] str = data.trim().split("=");
				
				map.put(str[0], str[1]);
			}
			fileReader.close();
			
			String key = map.get("key").toString();
			ChatGPT gpt = new ChatGPT(key);
			
			while(true)
			{
				
				Scanner scan = new Scanner(System.in);
				System.out.print("나: ");
				String msg = scan.nextLine();
				
				if(msg.equals("대화종료"))
					break;

				gpt.connect(map.get("url").toString());
				gpt.send(msg);
				String response = gpt.receive();
				
				//응답을 출력한다.
				System.out.println("AI:"+response);
			}	
	
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
