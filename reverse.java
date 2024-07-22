class J
{
	public static void main(String args[])
	{
		int n = 12,m;
		int sum = 0;
		while(n!=0)
		{
			m = n % 10;
			sum = (sum*10) + m;
			m = m/10;
		}
		System.out.println(n);
	}
}
