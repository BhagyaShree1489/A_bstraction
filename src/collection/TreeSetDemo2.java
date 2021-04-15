package collection;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
		
		 t.add("shree");
		 t.add(new Integer(100));//Exception in thread "main" java.lang.ClassCastException

	}

}
