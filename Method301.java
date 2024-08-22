import java.util.Scanner;
class Method301 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		factorial(n);
	}
	public static void factorial(int num){
		int res=1;
		for (int start=1;start<=num ;start++ )
		{
			res=res*start;
		}
		System.out.println(res);
	}
}
