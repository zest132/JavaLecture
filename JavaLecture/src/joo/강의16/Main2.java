package joo.강의16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import joo.Util;


public class Main2 {

	public static void main(String[] args) throws Exception {
	
		
		//chatGPT실습문제2();
		
		//chatGPT실습문제();
		실습문제최종완성();
	}
	
	public static void 실습문제2()
	{
		//chatGPT openAI 사이트에서 발급받은 키
		String key = "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";
		
		//URL 주소를 객체화하는 클래스
		URL url=null;
		
		//http 통신을 위한 클래스
		HttpURLConnection con=null;
		
		Scanner scanner = new Scanner(System.in); //입력을 받기 위한 스캐너 객체를 생성
		System.out.print("나:");
		String input = scanner.nextLine();
		
		
		//chatGPT 에게 보낼 메시지 json 형태로 되어있고 모델 정보와 메시지 정보가 들어가 있다.
		//chatGPT가 했던 대답을 돌려주기 위해서는 role 이 assistant 이여야 한다.
		//예제 -> messages\":[{\"role\":\"user\",\"content\":\"안녕\"},{\"role\":\"assistant\",\"content\":\"chatGPT의 대답\"}]
		String msg = "{\"model\": \"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\""+input+"\"}]}";

		
		//URL을 객체화 한다.
		try
		{
			 url = new URL("https://api.openai.com/v1/chat/completions");
		}catch(Exception ex)
		{
			
		}
		
		
		//객체화한 url을 통해 http통신을 위한 객체를 생성한다.메서드 방식은 POST 이다.
		try
		{
			 con = (HttpURLConnection) url.openConnection();
			 con.setRequestMethod("POST");
		}catch(Exception ex)
		{
			
		}
		
		//http 통신시 데이터 형태는 json이라고 선언
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		
		//발급받은 키값을 넣어준다.
		con.setRequestProperty("Authorization","Bearer "+key);
		
		//chatGPT의 대답이 느릴경우 기다려주는 타임을 설정
		con.setRequestProperty("Retry-After","3600");
		//데이터 전송을 위해 true로 설정해야 한다.
		con.setDoOutput(true);
		
		
		
		//http 통신시 데이터를 서버에 전송하기 위해 스트림을 연다( 스트림이란 데이터가 왔다갓다 하는 통로이다)
		try(OutputStream out = con.getOutputStream())
		{
			//문자열을 보내기전에 utf-8 형태로 인코딩을 변환하고 바이트로 변경한다.
			byte[] inputBytes = msg.getBytes("utf-8");
			//스트림으로 바이트로된 메시지를 전달한다.
			out.write(inputBytes,0,inputBytes.length);
			
			//바로 응답 요청을 보내면 chatGPT에서 에러를 보내온다. 2초간 기다려준다..
			Thread.sleep(2000);
			
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
			 con.getResponseCode();
		}catch(Exception ex)
		{
			
		}
		
		//chatGPT가 보내온 응답을 받기 위해 InputStream을 열고 버퍼를 통해 받아온다.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8")))
		{
			//응답을 저장할 String 변수이다.
			StringBuilder response = new StringBuilder();
			String responseLine  = null;
			//버퍼로 부터 데이터를 가져온다.
			while((responseLine = br.readLine()) != null)
			{
				//공백을 제거 하고 StringBuilder에 이어서 붙인다.
				response.append(responseLine.trim());
			}
			
			
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
	
	public static void 실습문제1()
	{
		//chatGPT openAI 사이트에서 발급받은 키
				String key = "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";
				
				//URL 주소를 객체화하는 클래스
				URL url=null;
				
				//http 통신을 위한 클래스
				HttpURLConnection con=null;
				
				//chatGPT 에게 보낼 메시지 json 형태로 되어있고 모델 정보와 메시지 정보가 들어가 있다.
				//chatGPT가 했던 대답을 돌려주기 위해서는 role 이 assistant 이여야 한다.
				//예제 -> messages\":[{\"role\":\"user\",\"content\":\"안녕\"},{\"role\":\"assistant\",\"content\":\"chatGPT의 대답\"}]
				String msg = "{\"model\": \"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\"안녕\"}]}";

				
				//URL을 객체화 한다.
				try
				{
					 url = new URL("https://api.openai.com/v1/chat/completions");
				}catch(Exception ex)
				{
					
				}
				
				
				//객체화한 url을 통해 http통신을 위한 객체를 생성한다.메서드 방식은 POST 이다.
				try
				{
					 con = (HttpURLConnection) url.openConnection();
					 con.setRequestMethod("POST");
				}catch(Exception ex)
				{
					
				}
				
				//http 통신시 데이터 형태는 json이라고 선언
				con.setRequestProperty("Content-Type", "application/json; utf-8");
				
				//발급받은 키값을 넣어준다.
				con.setRequestProperty("Authorization","Bearer "+key);
				
				//chatGPT의 대답이 느릴경우 기다려주는 타임을 설정
				con.setRequestProperty("Retry-After","3600");
				//데이터 전송을 위해 true로 설정해야 한다.
				con.setDoOutput(true);
				
				
				
				//http 통신시 데이터를 서버에 전송하기 위해 스트림을 연다( 스트림이란 데이터가 왔다갓다 하는 통로이다)
				try(OutputStream out = con.getOutputStream())
				{
					//문자열을 보내기전에 utf-8 형태로 인코딩을 변환하고 바이트로 변경한다.
					byte[] inputBytes = msg.getBytes("utf-8");
					//스트림으로 바이트로된 메시지를 전달한다.
					out.write(inputBytes,0,inputBytes.length);
					
					//바로 응답 요청을 보내면 chatGPT에서 에러를 보내온다. 2초간 기다려준다..
					Thread.sleep(2000);
					
					//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
					 con.getResponseCode();
				}catch(Exception ex)
				{
					
				}
				
				//chatGPT가 보내온 응답을 받기 위해 InputStream을 열고 버퍼를 통해 받아온다.
				try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8")))
				{
					//응답을 저장할 String 변수이다.
					StringBuilder response = new StringBuilder();
					String responseLine  = null;
					//버퍼로 부터 데이터를 가져온다.
					while((responseLine = br.readLine()) != null)
					{
						//공백을 제거 하고 StringBuilder에 이어서 붙인다.
						response.append(responseLine.trim());
					}
					
					
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
	
	public static void chatGPT실습문제()
	{
		//chatGPT openAI 사이트에서 발급받은 키
		String key = "키값을 넣으세요";
		
		//URL 주소를 객체화하는 클래스
		URL url=null;
		
		//http 통신을 위한 클래스
		HttpURLConnection con=null;
		
		//chatGPT 에게 보낼 메시지 json 형태로 되어있고 모델 정보와 메시지 정보가 들어가 있다.
		//chatGPT가 했던 대답을 돌려주기 위해서는 role 이 assistant 이여야 한다.
		//예제 -> messages\":[{\"role\":\"user\",\"content\":\"안녕\"},{\"role\":\"assistant\",\"content\":\"chatGPT의 대답\"}]
		String msg = "{\"model\": \"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\"안녕\"}]}";

		
		//URL을 객체화 한다.
		try
		{
			 url = new URL("https://api.openai.com/v1/chat/completions");
		}catch(Exception ex)
		{
			
		}
		
		//객체화한 url을 통해 http통신을 위한 객체를 생성한다.메서드 방식은 POST 이다.
		try
		{
			 con = (HttpURLConnection) url.openConnection();
			 con.setRequestMethod("POST");
		}catch(Exception ex)
		{
			
		}
		
		//http 통신시 데이터 형태는 json이라고 선언
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		
		//발급받은 키값을 넣어준다.
		con.setRequestProperty("Authorization","Bearer "+key);
		
		//chatGPT의 대답이 느릴경우 기다려주는 타임을 설정
		con.setRequestProperty("Retry-After","3600");
		//데이터 전송을 위해 true로 설정해야 한다.
		con.setDoOutput(true);
		
		
		
		//http 통신시 데이터를 서버에 전송하기 위해 스트림을 연다( 스트림이란 데이터가 왔다갓다 하는 통로이다)
		try(OutputStream out = con.getOutputStream())
		{
			//문자열을 보내기전에 utf-8 형태로 인코딩을 변환하고 바이트로 변경한다.
			byte[] inputBytes = msg.getBytes("utf-8");
			//스트림으로 바이트로된 메시지를 전달한다.
			out.write(inputBytes,0,inputBytes.length);
			
			//바로 응답 요청을 보내면 chatGPT에서 에러를 보내온다. 2초간 기다려준다..
			Thread.sleep(2000);
			
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
			 con.getResponseCode();
		}catch(Exception ex)
		{
			
		}
		
		//chatGPT가 보내온 응답을 받기 위해 InputStream을 열고 버퍼를 통해 받아온다.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8")))
		{
			//응답을 저장할 String 변수이다.
			StringBuilder response = new StringBuilder();
			String responseLine  = null;
			//버퍼로 부터 데이터를 가져온다.
			while((responseLine = br.readLine()) != null)
			{
				//공백을 제거 하고 StringBuilder에 이어서 붙인다.
				response.append(responseLine.trim());
			}
			
			
			//응답을 출력한다.
			System.out.println(response);
			
			
		}catch(Exception ex)
		{
			
		}
	}

	public static void JSON파싱예제()
	{
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
	}
	
	
	public static void 실습문제최종완성()
	{
	  String key = "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";
		  
	  ChatGPT chatGPT = ChatGPT.getInstance(key);
	  while(true) 
	  {
		  String input = Util.getKeyBoardValue("나:");
		  if(input.equals("exit")) { System.out.println("채팅을 종료 합니다."); return; }
		  
		  System.out.println("AI : "+chatGPT.chatting(input)); 
		
		  
		  
	  }
	}
	
	
}
