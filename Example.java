class Example 
{
	static int a=10;
	static int b=20;
	int x=30;
	int y=40;
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Example.a);
		System.out.println(Example.b);
		Example e=new Example();
		System.out.println(e.x);
		System.out.println(e.y);

		System.out.println(e.a);
		System.out.println(e.b);

		//System.out.println(Example.x);
		//System.out.println(Example.y);

		Example e1=null;
		System.out.println(e1.a);
		System.out.println(e1.b);
	}
}
