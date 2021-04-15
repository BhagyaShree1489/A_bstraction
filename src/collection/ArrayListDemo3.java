package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer>al= new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(60);
		al.add(50);
		al.add(56);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<String>al1= new ArrayList<String>();
		
		al1.add("Java");
		al1.add("selenium");
		al1.add("manual testing");
		al1.add("salesforce");
		
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
	}

}
