package day13;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		st.push(1);//java 1.0
		st.add(2);// java 1.2
		
		System.out.println(st);
		System.out.println(st.peek());//return top element
        System.out.println(st.pop());//it return and remove top element
        
        System.out.println(st);
	
		

	}

}
