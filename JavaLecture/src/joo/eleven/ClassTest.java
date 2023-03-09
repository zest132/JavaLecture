package joo.eleven;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

import joo.Student;



public  class ClassTest extends Student implements Serializable ,Closeable ,Appendable {

	@Override
	public Appendable append(char c) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(CharSequence csq) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Appendable append(CharSequence csq, int start, int end) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
}
