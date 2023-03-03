package joo;

import joo.eleven.Child;
import joo.eleven.Parent;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Parent test1 = new Child();
		Child test2 = new Child();
			
		System.out.println(test1.getAge());
		System.out.println(test2.getAge());

	}
}
