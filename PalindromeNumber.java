import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		int rev=0;
		int check=num;
		while (num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if (check==rev)
		{
			System.out.println("Yes this number is a palindrome number");
		}
		else{
			
			System.out.println("No this number is not a palindrome number");
		}
	}
}
