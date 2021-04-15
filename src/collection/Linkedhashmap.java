package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Linkedhashmap {

	public static void main(String[] args) {
		
		LinkedHashMap <Integer,String>lhm= new LinkedHashMap<>();
		
		lhm.put(111,"shree");
		lhm.put(112,"mina");
		lhm.put(113,"vaibhav");
		lhm.put(114,"Ganesh");
		lhm.put(115,"Ankita");
		System.out.println(lhm);
		
		for(Entry<Integer,String>e:lhm.entrySet()) {
			
			System.out.println(e.getKey()+"  "+e.getValue());
			lhm.remove(113);
			System.out.println(lhm);
			System.out.println(lhm.put(114, "Anil"));
			System.out.println(lhm);
		}
		

	}

	
	
		
	}

	
	
		
	


