class Test01 
{
	public static void main(String[] args) 
	{
		Example01 ex=new Example01();
		System.out.println(ex.x);
		ex.m2();

		ex.x=30;

		System.out.println(ex.x);
		ex.m2();

		ex.m1();
		System.out.println(ex.x);
		ex.m2();
	}
}
