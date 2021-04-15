package array;

public class Test {

	public static void main(String[] args) {
		
		int[]a = new int [5];
		int size = a.length;
		System.out.println(size);
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//first approach
		
		System.out.println(a[3]);
		
		//second approach
		
		for(int i=0; i<size; i++)
		{
System.out.println(a[i]);
	}
// third approach
		
		for(int aa:a) {
			System.out.println(aa);
		}
}
}