package collection;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		
		Stack<Object>s= new Stack<>();
		
		System.out.println(s.capacity());
		
		System.out.println(s.size());
		
		for(int i=0; i<s.capacity(); i++) {
			s.push(i);
		}
		s.push("Vasant");
		s.push(111);
		
		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println(s);
		
	}

}
