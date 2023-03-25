package joo.강의16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import joo.강의16.ChatGPTJson.Role;

/**
 * ChatGPT 학습을 위한 샘플 클래스
 * 싱글톤으로 구현한다.
 * @author 박주병
 *
 */
public class ChatGPT {

	private static ChatGPT instance =null;
	
	HttpURLConnection con;
	String key;
	
	//String model="text-davinci-003";
	//String preMsg = "{\"model\": \""+model+"\", \"prompt\": \"";
	//String sufMsg = "\",\"max_tokens\":1024}";
	
	URL url;
	ChatGPTJson msg = new ChatGPTJson("gpt-3.5-turbo");
	
	
	//String preMsg ="{\"model\": \"gpt-3.5-turbo\",\"messages\":[";
	
	//String sufMsg = "]}";

	
	
	
	private ChatGPT(String key)	
	{
		try
		{

			//url = new URL("https://api.openai.com/v1/completions");
			url = new URL("https://api.openai.com/v1/chat/completions");
			
			this.key = key;
			
		}catch (Exception e) {
			System.out.println("url 생성 오류");
			System.out.println(e);
		}
		
	}
	
	public static ChatGPT getInstance(String key)
	{
		if(instance ==null)
			instance = new ChatGPT(key);
		

		return instance;
	}
	
	/*
	 * return : Response Code 를 반환한다. 200=정상 그외 오류 
	 */
	private void send(String msg) throws Exception
	{
		//CjatGPTJson 객체를 이용하여 Json 형태로 메시지를 만든다.
		this.msg.addMsg(Role.USER, msg);
		
		
		//System.out.println(this.msg.toString());
		
		//http는 비연결성이기에 매 채팅마다 연결을 새로 해줘야 한다.
		con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		con.setRequestProperty("Authorization","Bearer "+key);
		con.setRequestProperty("Retry-After","3600");

		con.setDoOutput(true);
		
		
		
		try(OutputStream out = con.getOutputStream())
		{
			//문자열을 보내기전에 개행을 제거 하고 보낸다.
			byte[] inputBytes = this.msg.toString().replaceAll("\\R", "").getBytes("utf-8");
			out.write(inputBytes,0,inputBytes.length);
			Thread.sleep(2000);
			 con.getResponseCode();
		}catch(Exception ex)
		{
			throw ex;
		}
		
		
		
	}
	
	private String response() throws Exception
	{
	
		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8")))
		{
			StringBuilder response = new StringBuilder();
			
			String responseLine  = null;
			
			while((responseLine = br.readLine()) != null)
			{
				response.append(responseLine.trim());
			}
			
			
			JSONObject obj = new JSONObject(response.toString()); 
			  String result =obj.getJSONArray("choices")
							  .getJSONObject(0)
							  .getJSONObject("message")
							  .get("content").toString();
			
			  
			return result;
		}catch(Exception ex)
		{
			throw ex;
		}
		
		
	}
	public String chatting(String msg)
	{
		try
		{
			
			 send(msg);
			
			
			 String result = response();
			 
			 //AI의 응답을 다시 JSON으로 에코시키기 위해 AI의 응답역시 메시지에 포함시킨다.
			 this.msg.addMsg(Role.ASSISTANT, result);
	
			 return result;
			
		}catch(IOException ex)
		{
			return "인증키를 확인하세요"+ex.toString();
		}
		catch(Exception ex)
		{
			return ex.toString();
		}
		

		
	}
}
