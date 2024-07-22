class A extends Thread 
{
	int i ;
	A()
	{
		start();
	}
	public void  run()
	{
		try
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(i);
				sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
class D 
{
	public static  void  main(String args[])
	{
		A a1=new A();
		
	}
}