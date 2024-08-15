class SpyNumber1000_2000
{
	public static void main(String[] args){
		for (int num=1000;num<=2000 ;num++ )
		{
			int start=num,sum=0,pro=1,rem;
			while (start!=0)
			{
				rem=start%10;
				sum+=rem;
				pro*=rem;
				start/=10;
			}
			if (sum==pro)
			{
				System.out.println(num+" is a spy no.");
			}
		}
	}
}