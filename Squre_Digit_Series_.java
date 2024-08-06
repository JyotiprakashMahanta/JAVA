import java.util.Scanner;
class Squre_Digit_Series_ 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		int squre=0;
		int sum=0;
		while (num!=0)
		{
			rem=num%10;
			squre=rem*rem;
			num/=10;
			sum+=squre;
		}
		System.out.println(sum);
	}
}
