class Example11{
	static{
		System.out.println("SB Start");
		Example11 e=new Example11();
		System.out.println("SB End");
	}
	{
		System.out.println("NSB Start");
		System.out.println("NSB End");
	}
	Example11(){
		System.out.println("Constructor start");
		System.out.println("End of Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Example11 e=new Example11();
		System.out.println("End of main method");
	}
}
