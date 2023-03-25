package joo.강의16;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author chatGPT와 통신을 위한 Json 관리 클래스
 *
 */
public class ChatGPTJson {

	public enum  Role{
		SYSTEM  { public String toString(){return "system";}},
		USER  { public String toString(){return "user";}},
		ASSISTANT  { public String toString(){return "assistant";}},

	}

	private class Message
	{
		Role role;
		String content;
		
		 Message(Role role , String content)
		 {
			 this.role =role;
			 this.content = content;
		 }
	}
	
	private String model;
	private List<Message> msgList= new ArrayList<Message>();
	
	
	public ChatGPTJson(String model)
	{
		this.model = model;
	}
	
	public void addMsg(Role role, String msg)
	{
		msgList.add(new Message(role , msg));
	}
	
	
	@Override
	public String toString() {
	
		
		StringBuilder msg = new StringBuilder();
		
		
		msg.append("{\"model\": \""+model+"\",\"messages\":[");
		
		
		for(Message temp : msgList)
		{
			if(msgList.indexOf(temp) ==0)
				msg.append("{\"role\":\"");
			else
				msg.append(",{\"role\":\"");
			
			
			msg.append(temp.role);
			msg.append("\",\"content\":\"");
			msg.append(temp.content);
			msg.append("\"}");

				
		}
			
		msg.append("]}");
		
		
		return msg.toString();
		
	}
}
