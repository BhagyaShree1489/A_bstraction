package collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String>al= new ArrayList<>();
		
		al.add("Java");
		al.add("selenium");
		al.add("manual testing");
		al.add("Java");
		al.add("sql batch");
		al.add("manual testing");
		al.add("selenium");
		al.add("Java");
		
		System.out.println(al.indexOf("selenium"));
		System.out.println(al.lastIndexOf("selenium"));
		
		for(String al1:al) {
		System.out.println(al1);
		
	}
		System.out.println("*********");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
	}
}
