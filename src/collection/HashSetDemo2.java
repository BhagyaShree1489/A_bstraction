package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
HashSet<Object>sh= new HashSet<Object>();
		
		sh.add("Vasant");
		sh.add("lina");
		sh.add("smita");
		sh.add("dina");
		//System.out.println(sh);
		
		//sh.remove("lina");
		//System.out.println(sh);
		
		//sh.removeAll(sh);
		//System.out.println(sh);
		
		List<String>al= new ArrayList<String>();
		al.add("ankita");
		al.add("Shree");
		al.add("Ganesh");
		al.add("smita");
		sh.addAll(al);
		System.out.println(sh);

	}

}
