import java.util.Scanner;
class J
{
	public static void main(String args[])
	{
		int a,b,add;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=s.nextInt();
		System.out.println("Enter a number:");
		b=s.nextInt();
		add=a+b;
		System.out.println("The addition is:"+add);
	}
}