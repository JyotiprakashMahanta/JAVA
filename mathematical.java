import java.util.*;
class K
{
	void scan()
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		i=sc.nextInt();
		System.out.println("Enter another a number:");
		j=sc.nextInt();
		int k1,k2,k3,k4,k5;
		k1=i+j;
			k2=i-j;
			k3=i*j;
			k4=i/j;
			k5=i%j;
		System.out.println("the addition is: "+k1);
		System.out.println("the substraction is: "+k2);
		System.out.println("the multification is: "+k3);
		System.out.println("the division is: "+k4);
		System.out.println("the reminder is: "+k5);
	}
}
class J
{
	public static void main(String args[])
	{
		K k1=new K();
		k1.scan();
	}
}