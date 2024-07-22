class Non_Static_Method 
{
	int a=10;
	int b=20;
	void m1(){
		System.out.println("from m1 Method");
	}
	void test(){
		System.out.println(a);
		m1();
	}
	public static void main(String[] args) 
	{
		Non_Static_Method n=new Non_Static_Method();
		n.test();
	}
}
