// Given integer value is Whole number or not.
import java.util.Scanner;
class WholeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		if (num==(int)num)
		{
			System.out.println(num+" is a whole number");
		}else{
			System.out.println(num+" is not a whole number");
		}
	}
}
