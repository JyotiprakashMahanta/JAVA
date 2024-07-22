class Example22{
	int a= m1();
	int m1(){
		System.out.println("NSV x");
		System.out.println("End of m1");
		return 50;
	}
	{
		System.out.println("NSB start");
		//Example22 e=new Example22(); //It leads to SOE
		System.out.println("NSB end");
	}
	Example22(){
		System.out.println("Constructor start");
		System.out.println("Constructor end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		Example22 e=new Example22();
		System.out.println("main method end");
	}
}
