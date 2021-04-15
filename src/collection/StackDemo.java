package collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
    Stack<Object>s= new Stack<>();
    System.out.println(s.empty());
    
    s.push("zebra");
    s.push("tiger");
    s.push("lion");
    s.push("parrot");
    System.out.println(s.empty());
    System.out.println(s);
    
    Object top= s.pop();
    System.out.println(s);
    
    System.out.println(s.peek());
    System.out.println(s);
    
    System.out.println(s.search("zebra"));
    System.out.println(s.search("vikas"));

	}

}
