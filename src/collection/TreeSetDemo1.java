package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet<String> t= new TreeSet<String>();
		
		t.add("Vasant");
		t.add("anil");
		t.add("Raman");
		t.add("Ravi");
		t.add("Vikas");
		t.add("Vasant");
		//t.add(null);
		
		
		System.out.println(t.add("Ravi"));
		System.out.println(t);
		
		Iterator<String>itr= t.iterator();
		while(itr.hasNext()) {
			String str=  itr.next();
			System.out.println(str);
		}
		
		
		
	}

}
