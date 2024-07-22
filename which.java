class L
{
		 int test()
	{
		int i;
		i=10;
		return(i);
	}
	
}
class K extends L
{
	int can()
	{
		int i;
		i=20;
		return(i);
	}
	int take(int i)
	{
		System.out.println(i); 
		System.out.println(this.i);
		System.out.println(super.i);
		return(i);
	}
}
class J
{
	public static void main(String args[])
	{
		K k1=new K();
		k1.take(30);
	}
}