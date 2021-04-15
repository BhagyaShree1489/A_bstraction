package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<Object,Object>hm= new HashMap<>();
		
		hm.put(111, "shree");
		hm.put(112, "Raman");
		hm.put("Ravi", "Vikas");
		hm.put("Mukesh", 120);
		System.out.println(hm);

		Set<Object>keys=hm.keySet();
		System.out.println(keys);
		
		Collection<Object>values=hm.values();
		System.out.println(values);
	}

}
