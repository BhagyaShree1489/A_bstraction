package collection;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<String,String>hm=new HashMap<>();
		
		hm.put("State", "Capital");
		hm.put("Mah", "Mumbai");
		hm.put("Guj", "Gandhinagar");
		hm.put("Madhy", "Bhopal");
		
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.put("Mah", "Pune"));
		System.out.println(hm);
		System.out.println(hm.get("Mah"));
		hm.remove("Mah");
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
		
	}

}
