class A   extends Thread
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
class C  extends Thread
{
	public void  run()
	{
		System.out.println("class C is started");
	}
}
class  D
{
	public static void main(String args[])
	{
		A a1=new A();
		B b1=new B();
		C c1=new  C();
		a1.start();
		b1.start();
		c1.start();
	}
}
