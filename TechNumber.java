//Check whether the given number is tech number or not.
class TechNumber 
{
	public static void main(String[] args) 
	{
		int num=9809;
		int store=num,rem,count=0,half,pow=1,f,s,sum;
		while (num!=0)
		{
			rem=num%10;
			count++;
			num/=10;
		}
		if (count%2==0)
		{
			half=count/2;
			for (int i=1;i<=half ;i++ )
			{
				pow=10*pow;
			}
			f=store%pow;
			s=store/pow;
			System.out.println(f);
			System.out.println(s);
			sum=f+s;
			int res=sum*sum;
			if (store==res)
			{
				System.out.println("It is a tech number.");
			}else{
				System.out.println("It is not a tech number.");
			}
		}else{
			System.out.println("It not a tech number.");
		}
	}
}
