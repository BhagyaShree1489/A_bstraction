package logical_prog;

public class Reverse_String {

	public static void main(String[] args) {
		
		
		String s="BHAGYASHREE";
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			reverse= reverse+s.charAt(i);
		}
		
System.out.println("Reverse String is  "+reverse);
	}

}
