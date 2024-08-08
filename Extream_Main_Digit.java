import java.util.Scanner;
class Sum_Extream_Main_Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0,rem,extream=0,main=0;
		while (num!=0)
		{
			rem=num%10;
			count++;
			num/=10;
		}
		System.out.println(count);
	}
}
