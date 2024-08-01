import java.util.Scanner;
class  Addition
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int res=0;
		while (i<=j)
		{
			int k=i;
			System.out.println("first value: "+i+"second value: "+k+" result"+res);
			res+=i;
			 k=i++;
		}
		System.out.println("the sum of between "+i+" to "+" k "+res);
	}
}
