package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String>al= new ArrayList<String>();
		
		al.add("rina");
		al.add("mina");
		al.add("tina");
		al.add("simran");
		al.add("payal");
		
		System.out.println(al);
		
        Iterator<String>itr= al.iterator();
        while(itr.hasNext()) {
        	String Obj= itr.next();
        	System.out.println(Obj);
        	
        	if(Obj.equals("simran")) {
        		itr.remove();
        	}
        }
System.out.println(al);
	}

}
