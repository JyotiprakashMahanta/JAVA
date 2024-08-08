import java.util.Scanner;
class  Check_Odd_Digit_Series_using_for_loop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		for(;num!=0;num=num/10)
		{
			rem=num%10;
			if (rem%2==1)
			{
				System.out.print(rem+" ,");
			}
		}
	}
}