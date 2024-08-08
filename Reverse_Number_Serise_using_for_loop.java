import java.util.Scanner;
class Reverse_Number_Serise_using_for_loop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem,res=0;
		for (;num!=0 ;num=num/10)
		{
			rem=num%10;
			res=res*10+rem;
		}
		System.out.println(res);
	}
}
