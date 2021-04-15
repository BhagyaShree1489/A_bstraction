package array;

public class Test3 {

	public static void main(String[] args) {
		Student st1= new Student ("Vikas",11);
		Student st2= new Student ("ravi",12);
		Student st3= new Student ("Raman",13);
		
		Student [] st= new Student [5];
		st[0]= st1;
		st[2] = st2;
		st[4] = st3;
		
		for (Student s: st) {
			System.out.println(s.StuName+"...."+s.StuRollNum);
		}

	}

}
