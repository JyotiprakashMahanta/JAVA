import java.util.*;
class Y
{
	void tension()
	{
		System.out.print("Enter a number: ");
		Scanner ya=new Scanner(System.in);
		int i=ya.nextInt();
		System.out.print("Enter another a number: ");
		int j=ya.nextInt();
		char c;
		System.out.println("chose an operator : +,-,*,/,% ");
		c =ya.next().charAt(0);
		switch(c)
		{
			case '+' :
			{
				
				System.out.println(i+j+" is the addition");
			}
			break;
			case '-' :
			{
				System.out.println(i-j+" is the substraction");
			} 
			break;
			case '*':
			{
				System.out.println("The multification is: "+i*j);
			}
			break;
			case '/' :
			{
				System.out.println("The division is: "+i/j);
			}
			break;
			case '%' :
			{
				System.out.println("The reminder is: "+i%j);
			}
			break;
		}
	}
}
class J
{
	public static void main(String args[])
	{
		Y dipu=new Y();
		dipu.tension();
	}
}