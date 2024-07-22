class Z
{
	void test()
	{
		for(int y=10;y>=0;y--)
		{
			System.out.println(y);
		}
	}
}
class D
{
	public static void main(String args[])
	{
		Z zon=new Z();
		zon.test();
	}
}