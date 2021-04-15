package poly;

 class B implements It {
	
	 
	  public void test() {
			System.out.println("test()method");
		}
		public void test2() {
			System.out.println("test2()method");
		}
		

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	B b=  new B();	
	b.test();
	b.test2();
	It.test1();
	}
}