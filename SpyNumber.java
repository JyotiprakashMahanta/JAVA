import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int pro=1,sum=0,rem;
		while(num>0){
			rem=num%10;
			sum+=rem;
			pro*=rem;
			num/=10;
		}
		if (pro==sum)
		{
			System.out.println("It is a SPY Number");
		}else{
			System.out.println("It is not a SPY number");
		}
	}
}
