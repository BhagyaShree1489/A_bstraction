package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapDemo3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String>hm=new HashMap<>();
		
		hm.put(111, "Shree");
		hm.put(112, "Manish");
		hm.put(113, "Jaya");
		hm.put(114, "Vaibhav");
		hm.put(115, "Vandana");
		hm.put(116, "Vinayak");
		
	Set<Entry<Integer,String>>entries= hm.entrySet();
	System.out.println(entries);
	
	Iterator<Entry<Integer,String>>itr=entries.iterator();
	while(itr.hasNext()) {
		Entry<Integer,String>entry=itr.next();
		System.out.println(entry);
		System.out.println(entry.getKey()+"    "+entry.getValue());
				
		if(entry.getKey().equals(111)) {
			entry.setValue("Vaishali");
		}
	}
	System.out.println(hm);
	}

}
