import java.util.Scanner;
class  Squre_Digit_Series
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		int product=1;
		while (num!=0)
		{
			rem=num%10;
			product*=rem;
			num/=10;
		}
		System.out.println(product);
	}
}
