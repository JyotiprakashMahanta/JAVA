import java.util.*;
class J
{
	public static void main(String args[])
	{
		int i,j;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		System.out.println("Enter another a number: ");
		j=sc.nextInt();
		int m=i/j;
		int n=i%j;
		System.out.println("The Quotient is: "+m);
		System.out.println("The Reminder is: "+n);
	}
}