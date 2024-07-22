class A
{
	void over(int k)
	{
		System.out.println("H");
	}
	void over (int c,char p){}
}
class B extends A
{
	void over(int j,char ch)
	{
		System.out.println("M");
	}
}
class shows
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.over(5);
		a1.over(5,'*');
		B b1=new B();
		b1.over(10,'t');
	}
}