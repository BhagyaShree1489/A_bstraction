package logical_prog;

import java.util.Scanner;

public class prime_list_n {
	
	public static void main(String[] args) {
		
		int i,j,caunt,no ;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range");
          no=sc.nextInt();			
			for( i=1; i<=no; i++) 
			{
				caunt=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				caunt++;
			}
	       if(caunt==2)
	    	  System.out.println(i);

	}

		}
		}


