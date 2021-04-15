package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		Vector<String>v = new Vector<String>();
		
		v.add("prity");
		v.add("suman");
		v.add("rahul");
		v.add("riya");
		v.add("priya");
		v.add("ankita");
		
		System.out.println(v);
		
		Enumeration<String>e= v.elements();
		
		while(e.hasMoreElements()) {
			String ele = e.nextElement();
			System.out.println(ele);
		}
		

	}

}
