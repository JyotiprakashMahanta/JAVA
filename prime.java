import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int i,count;
		System.out.println("Enter a value=");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Prime number betwwen 1 to"+n+"are");
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			System.out.print(j+"  ");
		}
	}
}