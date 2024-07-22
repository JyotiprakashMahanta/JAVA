import java.util.*;
class J
{
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i>0.0)
		{
			System.out.println("it is a positive number");
		}
		else if(i<0.0)
		{
			System.out.println("it is a negative number");
		}
		else
		{
			System.out.println("it is zero");
		}
	}
}