import java.util.Scanner;
class Odisha
{
	void  Ram()
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("EVEN NUMBER");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
class Sita
{
	public static void main(String args[])
	{
		Odisha o=new  Odisha();
		o.Ram();
	}
}
