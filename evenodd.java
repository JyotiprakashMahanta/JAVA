import java.util.*;
class J
{
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner c=new Scanner(System.in);
		int i=c.nextInt();
		if(i%2==0)
		{
			System.out.println(i+" is even number");
		}
		else
		{
			System.out.println(i+" is odd number");
		}
	}
}