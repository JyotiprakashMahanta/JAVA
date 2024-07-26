// Find Greatest of Two numbers.
import java.util.Scanner;
class  GreatestTwoNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if (num1>num2)
		{
			System.out.println(num1+" is Greatest than "+num2);
		}else{
			System.out.println(num2+" is Greatest than "+num1);
		} 
		//System.out.println(num1>num2?num1+ " is greatest number":num2+" is greatest number");
	}
}
