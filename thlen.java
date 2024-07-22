
class  A implements  Runnable
{
	Thread th;int  i,len;
	String name="karismita";
	A()
	{
		 th=new Thread(this);
		th.start();
	}
	public void run()
	{
		len=name.length();
		for (i=0;i<len;i++)
		{
			System.out.println(name.charAt(i));
		
			try
			{
				th.sleep(100);
			}
			catch(Exception ex)
			{
				System.out.println(ex.toString());
			}
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