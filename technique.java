class H
{
	void fun()
	{
		int y=1;
		Integer y1=new Integer(y);
		Integer y2=new Integer(10);
		System.out.println(y1+"      "+y2);
	}
}
class J
{
	public static void main(String args[])
	{
		H j=new H();
		j.fun();
	}
}