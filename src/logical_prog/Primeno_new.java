package logical_prog;

import java.util.Scanner;

public class Primeno_new {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int no=s.nextInt();
		
		//int no=30;
		int caunt=0;
		
		for(int i=1;i<=no;i++)
			{
				if(no%i==0)
					caunt++;
			}
			if(caunt==2)
			{
				System.out.println(no+" is prime no");
			}
			else
			{
				System.out.println(no+" is not prime no");
			}
		}
		
	}


