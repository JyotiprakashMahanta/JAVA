class Example33{
	// Example33 e=new Example33(); // It leads to SOE
	static {
		System.out.println("SB start");
		System.out.println("NSB start");
	}
	int x=m1();
	int m1(){
		System.out.println("NSV x");
		System.out.println("end of m1");
		return 20;
	}
	{
		System.out.println("NSB start");
		System.out.println("NSB end");
	}
	Example33(){
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
	public static void main(String[] args){
		System.out.println("MM Start");
		Example33 e=new Example33();
		System.out.println("MM End...");
	}
}
