package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs= new LinkedHashSet<>();
		
		lhs.add("A");
		lhs.add("B");
		lhs.add("D");
		lhs.add("C");
		lhs.add("H");
		lhs.add("G");
		lhs.add("100");
		lhs.add("null");
		lhs.add("G");
		System.out.println(lhs.add("E"));
		System.out.println(lhs);

	}

}
