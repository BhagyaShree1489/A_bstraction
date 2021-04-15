package logical_prog;

public class Palindrome_number {

	public static void main(String[] args) {
		int  number= 101, rem, temp, sum=0;
		temp=number;
		
		while(number!=0)
		{
			rem= number%10;      
		   number=number/10; 
			sum= (sum*10)+rem;   
		}
       if(temp==sum)
	     System.out.println(sum+" is palindrome ");
       else
	      System.out.println(sum+"  is not palindrome");
	}

}


