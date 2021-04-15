package array;

public class Test4 {

	public static void main(String[] args) {
		Student st1= new Student ("Vikas",11);
		Student st2= new Student ("ravi",12);
		Student st3= new Student ("Raman",13);
		
		Student [] st= new Student [5];
		st[0]= st1;
		st[2] = st2;
		st[4] = st3;
		
		for(Object o: st) {
			
			if(o instanceof Student) {
				Student ss= (Student)o;
				System.out.println(ss.StuName+"..."+ss.StuRollNum);
			}
			if (o==null) {
				System.out.println(o);
			}
		}

	}

}
