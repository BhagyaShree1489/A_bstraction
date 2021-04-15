package star_pattern;

import java.util.Scanner;

public class Pattern7andPatter8 {

	public static void main(String[] args) {
int i,j,n;

Scanner sc=new Scanner(System.in);
//taking user input
System.out.print("Enter the number of row ");
 n=sc.nextInt(); 
 
 //declare for loop for print first pyramid
		
for( i=1;i<=n;i++)
{
      for( j=1;j<=n-i;j++)
      {
            System.out.print(" ");
      }
      for( j=1;j<=i*2-1;j++)
      {
            System.out.print("*");
      }
      System.out.println();
} 
//declare for loop for print reverse pyramid
for( i=n-1;i>0;i--)
{
      for( j=1;j<=n-i;j++)
      {
            System.out.print(" ");
      }
      for(j=1;j<=i*2-1;j++)
      {
            System.out.print("*");
      }
      System.out.println();
}
}
}