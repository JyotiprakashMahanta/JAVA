class Method52 
{
	public static void main(String[] args) 
	{
		int num=23;
		System.out.println(res(num));
	}
	public static int res(int num){
		int rem,sum=0;
		for (;num>0 ;num=num/10 )
		{
			rem=num%10;
			int res=fact(rem);
			sum=sum+res;
		}
		return sum;
	}
	public static int fact(int rem){
		int res=1;
		for (int i=1;i<=rem ;i++ )
		{
			res=res*i;
		}
		return res;
	} 
}
