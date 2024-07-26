//Couples are Eligible for Marriage or not.
import java.util.Scanner;
class  Eligible_Marriage_Not
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int boyAge=sc.nextInt();
		int girlAge=sc.nextInt();
		if (boyAge>=21 && girlAge>=21)
		{
			System.out.println("Couples are Eligible for Marriage.");
		}else{
			System.out.println("Couples are not Eligible for Marriage.");
		}
	}
}
