package poly;

public class SingletonClass {
	
	
	

static class singleton{
	
	static singleton obj= new singleton();
	
	private singleton()
	{
}

public  static singleton getInstance()
{
	return obj;
}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleton obj1= singleton.getInstance();
		System.out.println(obj1);
		singleton obj2= singleton.getInstance();
		System.out.println(obj2);

	}

}

}