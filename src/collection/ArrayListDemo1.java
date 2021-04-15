package collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList<String>al= new ArrayList<>();
		
		//System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.add("Java");
		al.add("selenium");
		al.add("manual testing");
		al.add("Java");
		al.add(null);
		
		al.add(2, "Javascript");
		al.add(4,"webdriver");
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al);

	}

}
