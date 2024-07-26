//Check the Given number is Divisible by 4 and 6.
import java.util.Scanner;
class  Divisible
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if ((num%4==0)&&(num%6==0))
		{
			System.out.println(num+" is Divisible by 4 and 6");
		}
		
	}
}
