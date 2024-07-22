import java.util.*;
class J
{
	public static void main(String args[])
	{
		char c;
		System.out.println("Enter a Charecter: ");
		Scanner sc= new Scanner(System.in);
		c=sc.next().charAt(0);
		int asciival= c;
		System.out.println( c + asciival);
	}
}