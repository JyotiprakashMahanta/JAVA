class  A implements Runnable
{
	Thread th;int i,len;
	String s1="KARISMITA";
	A()
	{
		th=new Thread (this);
		th.start();
	} 
	public void run()
	{
		len=s1.length();
		System.out.println(s1);
		System.out.println("length of  " +s1+"is ="+len);
		for(i=0;i<len;i++)
		{
			char at =s1.charAt(i);
			if(65<=at    &&     at<=90)
			{
				at=(char)(at+32);
			}
			System.out.println(at);
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
class Show
{
	public static void main(String  args[])
	{
		A a1=new A();
	}
}