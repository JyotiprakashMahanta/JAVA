
class JY
{
	void take()
	{
		System.out.println("Jyoti");
	}
}
class P extends JY
{
	void run()
	{
		System.out.println("Prakash");
	}
}
class M
{
	public static void main(String args[])
	{
		P p1=new P();
		//K j1=new K();
		p1.take();
		p1.run();
	}
}