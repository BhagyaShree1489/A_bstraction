package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet<Object>sh= new HashSet<Object>();
		
		sh.add("Vasant");
		sh.add("lina");
		sh.add("smita");
		sh.add("dina");
		
		boolean status= sh.add("smita");
		System.out.println(status);
		System.out.println(sh.add("Rakesh"));
		sh.add(100);
		sh.add(null);
		System.out.println(sh);
		
		Iterator<Object>itr= sh.iterator();
		while (itr.hasNext()) {
			Object obj= itr.next();
			System.out.println(obj);
		}

	}

}
