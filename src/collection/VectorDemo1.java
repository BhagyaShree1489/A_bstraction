package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		Vector v= new Vector<>();
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.add("Mina");
		v.add(111);
		v.add(null);
		v.add(111);
		v.add("Raman");
		v.add("shital");
		
		System.out.println(v.size());
		
		v.add("vasant");
		v.add(111);
		v.add(null);
		v.add(111);
		v.add("ankita");
		v.add("shree");
		
		System.out.println(v.capacity());
		System.out.println(v);
		
		v.remove(1);
		v.remove(5);
		System.out.println(v);
		
		v.add(4,"vaishali");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.addElement("testing");
		System.out.println(v);
		
		ArrayList l= new ArrayList();
		
		l.add("Shree");
		l.add(111);
		l.add(null);
		System.out.println(l);
		
		//v.clear();
		v.removeAllElements();
		
		System.out.println(v);
		
		
		
		
		
		

	}

}
