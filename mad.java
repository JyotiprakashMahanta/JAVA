import java.util.*;
class J
{
	public static void main(String args[])
	{
		char c;
		System.out.println("Enter a Character: ");
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		int k=c;
		System.out.println("The ascii value of "+c+"of: "+k);
	}
}