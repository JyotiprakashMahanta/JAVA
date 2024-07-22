import java.util.*;
class J
{
	public static void main(String args[])
	{
		char c;
		System.out.println("Enter a character: ");
		Scanner ya=new Scanner(System.in);
		c=ya.next().charAt(0);
		int i=c;
		System.out.println("The ASCII value of "+c+"is: "+i);
	}
}