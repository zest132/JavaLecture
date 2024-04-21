package joo.강의14;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	private HashMap<String,Integer> wordList = new HashMap();
	
	
	void add(String word)
	{
		//int cnt = wordList.get(word) == null ? 0 : wordList.get(word) ;
		
		int cnt = wordList.getOrDefault(word,0);
		
		wordList.put(word, ++cnt);//기존 단어갯수에 1증가 시켜서 넣는다.
	}
	
	int getWordCount(String word)
	{
		return wordList.getOrDefault(word,0);
	}
	
	void printAllWordCount()
	{
		//모든 요소를 순회하며 꺼내올때는 향상된 for문을 이용하고 Set형태로 변환하여 가져온다.
		 for (Map.Entry<String, Integer> entry : wordList.entrySet()) 
		 {
	        System.out.println("단어:"+entry.getKey() +"\t 갯수:"+ entry.getValue());
	     }
	}
	
	
	
}
