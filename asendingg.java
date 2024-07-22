class K
{
	void fan()
	{
		int g;
		for(g=0;g<=100;g++)
		{
			System.out.println(g);
		}
	}
}
class S extends K
{
	public static void main(String args[])
	{
		K bar=new K();
		bar.fan();
	}
}