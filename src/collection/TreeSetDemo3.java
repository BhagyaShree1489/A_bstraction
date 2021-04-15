package collection;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		
TreeSet<StringBuffer> t= new TreeSet<StringBuffer>();
		
		t.add(new StringBuffer("Vasant"));
		t.add(new StringBuffer("Anil"));
		t.add(new StringBuffer("Raman"));
		t.add(new StringBuffer("Ravi"));
		
		System.out.println(t);

	}

}
