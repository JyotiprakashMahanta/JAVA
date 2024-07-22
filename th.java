class  A implements  Runnable
{
	Thread th;int  i;
	A()
	{
		 th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for (i=1;i<=20;i++)
		{
			System.out.println("i ="+i);
		}
		try
		{
			th.sleep(200);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
class  Dis
{
	public static void main(String args[])
	{
		A a1=new A();
	}
}