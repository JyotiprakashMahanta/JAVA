class Method54 
{
	public static void main(String[] args) 
	{
		int num=371;
		int res=amstrong(num);
		if (num==res)
			System.out.println(num+" is a Amstrong Number...");
		else
			System.out.println(num+" is not a Amstrong Number");
	}
	public static int amstrong(int num){
		int rem,sum=0,count=0,store=num;
		for (;num>0 ;num=num/10 )
		{
			count++;
			rem=num%10;
		}
		int ok=digit(count,store);
		return ok;
	}	
	public static int digit(int count,int num){
		int rem,sum=0,store=count;
		for (;num>0 ;num=num/10 )
		{
			rem=num%10;
			int factOfRem=fact(rem,store);
			sum=sum+factOfRem;
		}
		return sum;
	}
	public static int fact(int rem,int count){
		int pow=rem;
		for (int i=1;i<count ;i++ )
		{
			pow=pow*rem;
		}
		return pow;
	} 
}
