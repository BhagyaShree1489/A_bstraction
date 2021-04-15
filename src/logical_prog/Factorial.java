package logical_prog;

public class Factorial {

	public static void main(String[] args) {
		
		int number=5,Fact=1;
		
		for(int i=1;i<=number;i++)
		{
		Fact= Fact*i;

	}
System.out.println("factorial is "   +Fact);
}
}