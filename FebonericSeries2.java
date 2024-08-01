class FebonericSeries2 
{
	public static void main(String[] args) 
	{
		long num1=0l;
		long num2=1l;
		int count=2;
		long res=1l;
		System.out.println(num1);
		System.out.println(num2);
		while (count<=98)
		{
			res=num1+num2;
			System.out.println(res);
			num1=num2;
			num2=res;
			count++;
		}
	}
}
