package star_pattern;

public class Pattern2 {

	public static void main(String[] args) {
		int i, j;   
		//outer loop for rows  
		for(i=1; i<=6; i++)   
		{   
		//inner loop for columns  
		for(j=6; j>=i; j--)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   

	}

}
