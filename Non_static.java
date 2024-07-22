class Non_static 
{
	 static int a= 10;
	 static int b=20;
	 		int c=30;
			int d=40;
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
		Non_static n=new Non_static();
		System.out.println(n.c);
		System.out.println(n.d);
		System.out.println(n.a);
		System.out.println(n.b);
		//System.out.println(Non_static.c);
		//System.out.println(Non_static.d);
		Non_static n1=null;
		n.c=100;
		System.out.println(n.c);
		//System.out.println(n1.c);

	}
}
