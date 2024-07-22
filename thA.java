class A extends Thread
{
	public void run()
	{
		System.out.println("class A is started");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("class B is started");
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("class C is started");
	}
}
class D extends Thread
{
	public static void main(String args[])
	{
		A a=new A();
		a.run();
		B b=new B();
		b.run();
		C c =new C();
		c.run();
	}
}