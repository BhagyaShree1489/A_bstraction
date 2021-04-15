package star_pattern;

public class Pattern5 {

	public static void main(String[] args) {
		
int i,j,k;
		
		
		 for(i=1;i<=4;i++) //for rows
		{
			for(j=4;j>=1;j--) //for spaces
			{
				if(j>i) {
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}

			System.out.println();
	}
		
	}}

//copy from pattern 3

/*for(i=1;i<=5;i++) //for rows
{
	for(j=4;j>=i;j--) //for spaces
	{

System.out.print(" ");
}
	for(k=1;k<=i;k++) //for column
	{
System.out.print(" *");
}
	System.out.println();
}
}}
	*/