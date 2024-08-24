//
class Method50 
{
	public static void main(String[] args) 
	{
		int num=88628;
		int res=count(num);
		System.out.println(res);
	}
	public static int count(int num){
		int rem,count=0;
		for (;num>0 ;num=num/10 )
		{
			rem=num%10;
			count++;
		}
		return count;
	}
}
