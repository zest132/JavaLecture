package joo.강의16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;


public class ChatGPT {

	private String key;
	
	private JSONObject sendMsg = new JSONObject();
	
	private HttpURLConnection con;
	
	public ChatGPT(String key)
	{
		this.key = key;
		 
		 sendMsg.put("model", "gpt-3.5-turbo");
		 sendMsg.put("messages",new  JSONArray() );
	}
	
	
	public HttpURLConnection connect()
	{
		return connect("https://api.openai.com/v1/chat/completions");
	}
	
	public HttpURLConnection connect(String url)
	{
		
		try
		{
			//객체화한 url을 통해 http통신을 위한 객체를 생성한다.메서드 방식은 POST 이다.
			con = (HttpURLConnection)new URL( url).openConnection();
			con.setRequestMethod("POST");
			//http 통신시 데이터 형태는 json이라고 선언
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			//발급받은 키값을 넣어준다.
			con.setRequestProperty("Authorization","Bearer "+key);
			//chatGPT의 대답이 느릴경우 기다려주는 타임을 설정
			con.setRequestProperty("Retry-After","3600");
			//데이터 전송을 위해 true로 설정해야 한다.
			con.setDoOutput(true);
			
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
		return con;
		
	}
	
	public String makeJsonMsg(String role , String msg)
	{
		
		//json 형태로 되어있고 모델 정보와 메시지 정보가 들어가 있다.
		//chatGPT가 했던 대답은 role 이 assistant 이여야 한다.
		//예제 -> messages\":[{\"role\":\"user\",\"content\":\"안녕\"},{\"role\":\"assistant\",\"content\":\"chatGPT의 대답\"}]
		//String json = "{\"model\": \"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\""+msg+"\"}]}";

		JSONArray messages = (JSONArray)sendMsg.get("messages");
		
		JSONObject json = new JSONObject();
		
		json.put("role", role);
		json.put("content", msg);
		
		messages.put(json);
		
		
		return sendMsg.toString();
		
	}
	
	public void send(String msg)
	{
		try
		{
			//chatGPT에게 전달한 JSON 형태로 변환한다.
			String json = makeJsonMsg("user",msg);
			
			send(con.getOutputStream(),json);
			
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
	}

	public void send(OutputStream out , String msg)
	{
		
		try
		{
			//문자열을 보내기전에 utf-8 형태로 인코딩을 변환하고 바이트로 변경한다.
			byte[] inputBytes = msg.getBytes("utf-8");
			//스트림으로 바이트로된 메시지를 전달한다.
			out.write(inputBytes);
			
			out.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}

	}
	
	public String receive()
	{
		try
		{
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
			con.getResponseCode();
			
			
			
			
			String json = receive(con.getInputStream());
			String msg = parseJsonMsg(json);
			
			//json 형태의 메시지는 받았을때는 필요 없으니 반환값을 따로 저장해두진 않는다.
			makeJsonMsg("assistant",msg);
			
			return msg;
			
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
		
		return null;
	}
	
	public String receive(InputStream in)
	{
		StringBuilder response = new StringBuilder();
		try
		{
			//chatGPT가 보내온 응답을 받기 위해 InputStream을 열고 버퍼를 통해 받아온다.
			//InputStreamReader 클래스는 바이트기반스트림을 문자기반스트림으로 변환해준다.
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
		
			//응답을 저장할 String 변수이다.
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
			
			br.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
		
		return response.toString();
	}
	
	

	
	
	
	public String parseJsonMsg(String json)
	{
		//chatGPT로 부터 받은 JSON 데이터를 파싱하여 대답 부분만 추출한다.
		JSONObject obj = new JSONObject(json); 
		String result =obj.getJSONArray("choices")
						  .getJSONObject(0)
						  .getJSONObject("message")
						  .get("content").toString();
		
		
		return result;
	}
}
