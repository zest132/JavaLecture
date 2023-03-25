package joo.강의14;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	private List<T> stack;
    
    public MyStack(){
        this.stack = new ArrayList<>();
    }
    
    public void push(T value){
        stack.add(value);
    }
    
    public T pop(){
        if(stack.isEmpty())
        {
            throw new RuntimeException("Stack is empty");
        }
        T value = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return value;
    }
}
