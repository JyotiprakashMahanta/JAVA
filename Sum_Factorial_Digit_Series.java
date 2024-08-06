class Sum_Factorial_Digit_Series 
{
	public static void main(String[] args) 
	{
		int num=0;
		int pro=1;
		int sum=0;
		int rem;
		while (num>0)
		{
			rem=num%10;
			while (rem>0)
			{	
				pro=rem*pro;
				rem--;
			}
			num/=10;
			sum+=pro;
		}
		System.out.println(sum);
	}
}
