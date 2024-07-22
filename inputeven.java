import java.util.*;
class J
{
	public static void main(String args[])
	{
		int i;
		Scanner w=new Scanner(System.in);
		System.out.println("enter a number:");
		i=w.nextInt();
		if(i%2==0)
		{
			System.out.println(i+"-This is a even number");
		}
		else
		{
			System.out.println(i+"-This is a odd number: ");
		}
	}
}