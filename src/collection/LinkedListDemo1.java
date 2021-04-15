package collection;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<Object>l= new LinkedList<Object>();
		
		l.add("vasant");
		l.add(100);
		l.add(null);
		l.add("vasant");
		
		System.out.println(l);
		l.add(2, "Raman");
		l.add("Ravi");
		System.out.println(l);
		l.set(3, "Ankita");
		System.out.println(l);
		l.remove(4);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
		
		l.addFirst("Vikas");
		l.addLast("Rahul");
		
		System.out.println(l);
	}

}
