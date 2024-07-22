import java.util.Scanner;
class N
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		a=s.nextInt();
		System.out.println("Enetr another a number:");
		b=s.nextInt();
		c=a+b;
		System.out.println("The addition is:"+c);
	}
}