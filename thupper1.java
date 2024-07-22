 class A implements  Runnable
{
	Thread th;int i, len;
	String s1="karismita";
	A()
	{
		th=new Thread(this);
		th.start();
	}
	public  void  run()  
	{
		String s2=s1.toUpperCase();
		len=s2.length();
		for(i=0;i<len;i++)
		{
			System.out.println(s2.charAt(i));
	
			try
			{
				th.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}	
	}
}
class Dis
{
	public static void main(String args[])
	{
		A a1=new A();
	}
}	