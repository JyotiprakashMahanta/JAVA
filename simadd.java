class Y
{
	void tech()
	{
		System.out.println("Enter two number: ");
		int first=10;
		int second=20;
		System.out.println(first+" "+second);
		int sum=first+second;
		System.out.println("The addition is: "+sum);
	}
}
class J
{
	public static void main(String args[])
	{
		Y y1=new Y();
		y1.tech();
	}
}