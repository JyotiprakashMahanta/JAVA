class PerfectNumber1_100 
{
	public static void main(String[] args) 
	{
		for (int num=1;num<=100 ;num++ )
		{
			int start=num,sum=0;
			for (int i=1;i<=start/2 ;i++ )
			{
				if (start%i==0)
				{
					sum+=i;
				}
			}
			if (start==sum)
			{
				System.out.println(num+" is perfect no.");
			}
		}
	}
}
