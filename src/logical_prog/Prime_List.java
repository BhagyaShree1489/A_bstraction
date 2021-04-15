package logical_prog;

public class Prime_List {

	public static void main(String[] args) {
		
	int i,j,caunt ;
		
		for( i=1; i<=100; i++) 
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