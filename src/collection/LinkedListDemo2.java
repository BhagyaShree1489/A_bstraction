package collection;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList<String>l= new LinkedList<>();
		
		l.add("Raman");
		l.add("Mahima");
		l.add("Tushar");
		l.add("Vikas");
		l.add("Mukesh");
		
		System.out.println(l);
		
		for(String s:l) {
			System.out.println(s);
		}
		
		LinkedList<String>l1= new LinkedList<>();
		l1.add("Umesh");
		l1.add("Savita");
		l1.add("Priyanka");
		l1.add("Manish");
		
		System.out.println(l1);
		for(String s:l1) {
			System.out.println(s);
		}
l.addAll(1, l1);
System.out.println(l);

//l.removeAll(l1);
//l.clear();

l.retainAll(l1);
System.out.println(l);
	}

}
