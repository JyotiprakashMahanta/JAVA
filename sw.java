import java.util.Scanner;
class Cal
{
	public static void main(String args[])
	{
		int a,b;char p;
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter 2 integer= ");
		a=s1.nextInt();
		b=s1.nextInt();
		System.out.println("\n Enter an Operator= ");
		p=s1.next().charAt(0);
		switch(p)
		{
			case '+':System.out.println("a+b=  "+(a+b));;
			break;
			case '-':System.out.println("a-b=  "+(a-b));
			break;
			case '*':System.out.println("a*b = "+(a*b));
			break;
			case '/':System.out.println("a/b = "+(a/b));
			break;
			case '%':System.out.println("a%b ="+(a%b));
			break;
			
		}
		
	}
}