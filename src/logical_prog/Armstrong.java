package logical_prog;

public class Armstrong {

	public static void main(String[] args) {
		
		 int sum=0,rem,temp;
		  int num=371;//It is the number to check armstrong  
		    temp=num; 
		    
		    while(num!=0)  
		    {  
		    rem=num%10;  
		    num=num/10;  
		    sum=sum+(rem*rem*rem);  
		    } 
		    
		    if(temp == sum)  
              System.out.println(" Armstrong number");
			
			else
	            System.out.println(" not an Armstrong number");  
		  

	}

}
