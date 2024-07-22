class Base
{
	int i;
	Base()
	{
		i=10;
	}
}
class Dance extends Base 
{
	int i;
	Dance()
	{
		i=30;
	}
	void display(int i)
	{
		System .out.println(i);
		System.out.println(this.i);
		System.out.println(super .i);
	}
}
class result
{
	public static void main(String args[])
	{
		Dance d1=new Dance();
		d1.display(666);
	}
}
	