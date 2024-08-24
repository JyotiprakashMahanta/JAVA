class Method53 
{
	public static void main(String[] args) 
	{
		int num=40585;
		int fres=sumOfFact(num);
		if (num==fres)
		{
			System.out.println(num+" It is strong number");
		}else{
			System.out.println(num+" It is not strong number");
		}
	}
	public static int sumOfFact(int num){
		int rem,sum=0;
		for (;num>0 ;num=num/10 )
		{
			rem=num%10;
			int sumOfFact=fact(rem);
			sum=sum+sumOfFact;
		}
		return sum;
	}
	public static int fact(int rem){
		int fact=1;
		for (int i=1;i<=rem ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}
}
