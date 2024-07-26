//Given number is divisible by 7 or not.
import java.util.Scanner;
class  DivisibleBy7
{
	public static void main(String[] args) 
	{
		Scanner scc=new Scanner(System.in);
		int num=scc.nextInt();
		if (num%7==0)
		{
			System.out.println(num+" is divisible by 7");
		}else{
			System.out.println(num+" is not divisible by 7");
		}
		
	}
}
