package star_pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j,k;
		
		
		for(i=1;i<=5;i++) //for rows
		{
			for(j=4;j>=i;j--) //for spaces
			{
		
System.out.print(" ");
	}
			for(k=1;k<=i;k++) //for column
			{
System.out.print("*");
}
			System.out.println();
	}
	}}