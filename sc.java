import java.util.*;

class Scan
{
	void  Box()
	{
		int a;String str;float f;double d;boolean b;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number= ");
		a=s1.nextInt();
		System.out.println("Squar of "+ a+"is= "+a*a);
		System.out.println("Enter your name= ");
		str=s1.next();
		System.out.println("name you have enterd is= "+str);
		System.out.println("Enter a decimal number= ");
		f=s1.nextFloat();
		System.out.println("Float value is = "+f);
		System.out.println("Enter an other decimal  number= ");
		d=s1.nextDouble();
		System.out.println("Double value is = "+d);
		System.out.println("Enter a boolean value = ");
		b=s1.nextBoolean();
		System.out.println("Boolean value is = "+b);
	}
}
class Dis
{
	public static void main(String args[])
	{
		Scan s1=new Scan();
		s1.Box();
	}
}