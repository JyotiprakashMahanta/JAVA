import java.util.*;
class K
{
	public static void main(String args[])
	{
		System.out.println("Enter a character: ");
		Scanner sc=new Scanner(System.in);
		char c;
		c=sc.next().charAt(0);
		int i=c;
		System.out.println("THE VALUE IS "+c+" is "+i);
	}
}