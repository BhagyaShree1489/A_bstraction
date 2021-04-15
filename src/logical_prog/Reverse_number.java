package logical_prog;

public class Reverse_number {

	public static void main(String[] args) {
		
		//using for loop
		
		//int num=654321,reverse=0;
		
         //for(;num!=0; num=num/10) {               //num= 654321  65432   6543  654  65 6
			
	       // int rem= num%10;             //rem= 1       2      3    4    5    6
			//reverse= reverse*10 + rem;   //reverse= 1    2
		//}
		
//System.out.println("Reverse number is  "+reverse);    //1  2
	//}

//}
//}

{


//using while loop

   int num=654321,reverse=0;
   
     while(num != 0)   
    {  
     int rem = num % 10;  

     reverse = reverse * 10 + rem;  

     num = num/10;  

    }  
  
      System.out.println("The reverse of the given number is: " + reverse);  
}
}  }