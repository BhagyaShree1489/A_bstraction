package collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList <>();
		ArrayList al= new ArrayList<>();
		Vector v= new Vector<>();
		HashSet hs = new HashSet<>();
		
System.out.println(ll instanceof RandomAccess);
System.out.println(ll instanceof Serializable);
System.out.println(ll instanceof Cloneable);

System.out.println(al instanceof RandomAccess);
System.out.println(al instanceof Serializable);
System.out.println(al instanceof Cloneable);

System.out.println(v instanceof RandomAccess);
System.out.println(v instanceof Serializable);
System.out.println(v instanceof Cloneable);

System.out.println(hs instanceof RandomAccess);
System.out.println(hs instanceof Serializable);
System.out.println(hs instanceof Cloneable);

	}

}
