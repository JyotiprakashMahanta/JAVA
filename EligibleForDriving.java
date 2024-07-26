//Given Age of a person is Eligible for Driving licence or not.
import java.util.Scanner;
class  EligibleForDriving
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
	/*	if (age>=18)
		{
			System.out.println("eligible for drivng");
		}else{
			System.out.println("not eligible for drivng");
		} */
		System.out.println(age>=18?"eligible for drivng":"not eligible for drivng");
	}
}
