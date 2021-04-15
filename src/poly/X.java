package poly;

public class X {
	
	static{
		System.out.println("static block started");
		}
	
	{
		System.out.println("IIB block started");
	}
	X(){
		
		System.out.println("user define 0 arg const");
	}
	
	public void test()
	{
		System.out.println("inst test method called");
	}
	
    X(int a){
		this();
		System.out.println("user define 1 arg const");
	}
	
	public void test1()
	{
		System.out.println("inst test method called");
	}
	public static void main(String[] args) {

		System.out.println("main method started");
		new X().test();
		new X(12).test1();
		System.out.println("main method ended");
	}

}
