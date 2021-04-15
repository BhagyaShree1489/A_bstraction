package collection;

import java.util.IdentityHashMap;

public class Identityhashmap {

	public static void main(String[] args) {
		IdentityHashMap<Integer,String>hm= new IdentityHashMap<>();
		
		Integer I1= new Integer(10);
		Integer I2= new Integer(10);
		
		hm.put(I1, "vadant");
		hm.put(I2, "ankita");
		
		System.out.println(hm);

	}

}
