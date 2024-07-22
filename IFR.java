class IFR 
{
	static int a=10;
	static int b;
	static{
		System.out.println("SM");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("MM");
		IFR i=new IFR();
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
