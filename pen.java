class Ram
{
	public static void main(String args[])
	{
		final a=10;
		{
			System.out.println("value of a= "+a);
		}
		try
		{
			a=30;
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}			
		System.out.println("value of a= "+a);
	}
}