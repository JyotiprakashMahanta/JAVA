import java.util.Scanner;
class Sum_Prime_Digit_Series 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		int sum=0;
		while (num!=0)
		{
			rem=num%10;
			int start=2;
			int count=0;
			while (start<rem)
			{
				if (rem%start==0)
				{
					count++;
				}
				start++;
			}
			if (count==0 && rem>1)
			{
				sum+=rem;
			}
			num/=10;
		}
		System.out.println(sum);
	}
}
