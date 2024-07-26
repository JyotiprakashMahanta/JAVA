//Greatest of Four Numbers
import java.util.Scanner;
class  GreatestFourNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
	/*	if (num1>num2 && num1>num3 && num1>num4)
		{
			System.out.println(num1+" is greatest number.");
		}else if (num2>num1 && num2>num3 && num2>num4)
		{
			System.out.println(num1+" is greatest number.");
		}else if (num3>num1 && num3>num2 && num3>num4)
		{
			System.out.println(num3+" is greatest number.");
		}else{
			System.out.println(num4+" is greatest number.");
		} */
		System.out.println(num1>num2 && num1>num3 && num1>num4?num1+" is greatest number.":(num2>num1 && num2>num3 && num3>num4?num2+" is greatest number.":(num3>num1 && num3>num2 && num3>num4?num3+" is greatest number.":num4+" is greatest number.")));
	}
}
