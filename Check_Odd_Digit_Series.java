import java.util.Scanner;
class  Check_Odd_Digit_Series
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		while (num!=0)
		{
			rem=num%10;
			if (rem%2==1)
			{
				System.out.print(rem+" ,");
			}
			num/=10;
		}
	}
}
