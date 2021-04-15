package array;

public class Test1 {

	public static void main(String[] args) {
		
		Test t1= new Test();
		Test t2= new Test();
		Test t3= new Test();
		
		Test[]t= new Test [3];
		t[0] = t1;
		t[1] = t2;
		t[2] = t3;
		
		for(Test tt:t) {
		System.out.println(tt);
		
		}
	}

}
