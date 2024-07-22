import java.util.*;
class J
{
	public static void main(String args[])
	{
		System.out.println("Enter a character: ");
		Scanner sc=new Scanner(System.in);
		char c;
		c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println(" is vowel");
		}
		else
		{
			System.out.println("is consonant");
		}
	}
}
