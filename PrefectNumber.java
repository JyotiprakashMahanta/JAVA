import java.util.Scanner;
class  PrefectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,rem,n=num,fac=1;
		while (fac<=num/2)
		{
			if (num%fac==0)
			{
				sum+=fac;
			}
			fac++;
		}
		if (num==sum)
		{
			System.out.println("This number is perfect no");
		}else{
			System.out.println("not a perfect no.");
		}
	}
}
