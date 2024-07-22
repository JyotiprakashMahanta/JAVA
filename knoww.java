import java.util.Scanner;

class J
{
	public static void main(String args[])
	{
		int a,b,c,d;
		System.out.println("Enter a starting number: ");
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
		System.out.println("Enter a Ending number: ");
		Scanner e=new Scanner(System.in);
		d=e.nextInt();
		for(a=c;a<=d;a++)
		{ 
			
			System.out.println("...........................................................................");
			for(b=1;b<=10;b++)
			{
				System.out.print(b*a+"\t");
			}
			System.out.println();
			for(b=1;b<=10;b++)
			{
				System.out.print(b+"\t");
			}
			System.out.println();
			for(b=1;b<=10;b++)
			{
				System.out.print(a+"\t");
			}
			System.out.println("\n.............................................................................");
			
		}
	}
}
