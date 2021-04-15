package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
	
List<String>al= new ArrayList<String>();
		
		al.add("rina");
		al.add("mina");
		al.add("tina");
		al.add("simran");
		al.add("payal");
		
		System.out.println(al);
		
       ListIterator<String>itr= al.listIterator();
       
        while(itr.hasNext()) {
        	String Obj= itr.next();
        	System.out.println(Obj);
        	
        	if(Obj.equals("simran")) {
        		itr.remove();
        	}
        	else if(Obj.equals("tina")) {
        		itr.set("vaishali");
        		
        	}
        
        	}
        itr.add("ankita");
System.out.println(al);
}
}