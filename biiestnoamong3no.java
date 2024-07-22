import java.util.Scanner();
class J
{
	public static void main(String args[])
	{
		System.out.println("Enter 1st number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("Enter 2nd number");
		int j=sc.nextInt();
		System.out.println("Enter 3rd number");
		int k=sc.nextInt();
		if(i>j && i>k)
		{
			System.out.println(i+" is the biggest number");
		}
		else if(j>i &&j>k)
		{
			System.out.println(j+" is the biggest number");
		}
		else
		{
			System.out.println(k+" is the biggest number");
		}
	}
}