import java.util.*;
class D
{
	public static void main(String args[])
	{
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		i=sc.nextInt();
		System.out.println("Enter 2nd number:");
		j=sc.nextInt();
		//System.out.println("Enter 3rd number:");
		//k=sc.nextInt();
		if(i<j)
		{
			System.out.println(i+"is biggest among 3 number");
		}
		/*else if(i<j && k<j)
		{
			System.out.println(i+"is biggest among 3 number");
		}*/
		else
		{
			System.out.println(i+"is biggest among 3 number");
		}
	}
}