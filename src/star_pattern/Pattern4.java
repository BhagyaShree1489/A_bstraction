package star_pattern;

public class Pattern4 {

	public static void main(String[] args) {
		
		int i,j,k;
		for(i=1;i<=4;i++) //for row
		{
         for(j=1;j<=i;j++)//for column
	{
        	 System.out.print(" ");
	}
        	 for(k=4;k>=i;k--)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
	}
	}

}
