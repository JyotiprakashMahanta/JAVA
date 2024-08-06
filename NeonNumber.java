import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();int check=num;
		int pro=num*num;
		int sum=0,rem;
		while (pro!=0)
		{
			rem=pro%10;
			sum+=rem;
			pro/=10;
		}
		if (check==sum)
		{
			System.out.println("It is a Neon Number.");
		}else{
			System.out.println("It is not a Neon Number.");
		}
	}
}
