import java.util.*;
class Y
{
	void take()
	{
		char c;
		System.out.println("Enter a character:");
		Scanner ya=new Scanner(System.in);
		c=ya.next().charAt(0);
		if(c == 'a' ||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("is vowel");
		}
		else
		{
			System.out.println("is consonant");
		}
	}
}
class J
{
	public static void main(String args[])
	{
		Y dipu=new Y();
		dipu.take();
	}
}