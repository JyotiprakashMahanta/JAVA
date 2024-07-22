class Dove
{
	public static void main(String args[])
	{
		int n=2343,reverse=0;
		while(n!=0)
		{
			int result=n%10;
			reverse=reverse*10+result;
			n=n/10;
		}
		System.out.println("The reverse of the given number is ="+reverse);
	}
}