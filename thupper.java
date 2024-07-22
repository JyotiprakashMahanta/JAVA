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
		String s1=name.toUpperCase();
		System.out.println(s1);
		len=s1.length();
		for (i=0;i<len;i++)
		{
			System.out.println(s1.charAt(i));
		}
		try
		{
			th.sleep(10000);
		}
		catch(Exception ex)
		{
			System.out.print(ex.toString());
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