package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList<Object> al= new ArrayList<Object>();
		al.add("java");
		al.add(100);
		al.add(true);
		al.add(43.78);
		al.add(null);
		al.add(100);
		al.add(null);
		
System.out.println(al);

List <Object>l= new ArrayList<Object>();
l.add("Software testing");
l.add("manual Testing");
l.add(10000);
System.out.println(l);

al.addAll(l);
System.out.println(al);

al.remove(3);
System.out.println(al);

al.removeAll(l);
System.out.println(al);

al.clear();
System.out.println(al);
	}

}
