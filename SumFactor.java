import java.util.Scanner;
class SumFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1,sum=0;
		while (fact<=num)
		{
			if(num%fact==0)
			{
				sum+=fact;
			}
			fact++;
		}
		System.out.println(sum);
	}
}
