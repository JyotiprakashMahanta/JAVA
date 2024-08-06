import java.util.Scanner;
class  Sum_Even_Digit_Series
{
	public static void main(String[] args) 
	{
		Scanner scc=new Scanner(System.in);
		int num=scc.nextInt();
		int rem;
		int sum=0;
		while (num!=0)
		{
			rem=num%10;
			if (rem%2==0)
			{
				sum+=rem;
			}
			num/=10;
		}
		System.out.println(sum);
	}
}
