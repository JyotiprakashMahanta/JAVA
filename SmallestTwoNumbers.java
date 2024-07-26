// Find Smallest of Two numbers.
import java.util.Scanner;
class SmallestTwoNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
	/*	if (num1>num2)
		{
			System.out.println(num1+" is greatest number");
		}else{
			System.out.println(num2+" is greatest number");
		} */
		System.out.println(num1>num2?num1+" is greatest number":num2+" is greatest number");
		
	}
}
