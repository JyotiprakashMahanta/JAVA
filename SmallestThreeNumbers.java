//Smallest of Three numbers.
import java.util.Scanner;
class  SmallestThreeNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
	/*	if (num1<num2 && num1<num3){
			System.out.println(num1+" is smallest number.");
		}else if (num2<num1 && num2<num3){
			System.out.println(num2+" is smallest number.");
		}else{
			System.out.println(num3+" is smallest number.");
		} */
		
		System.out.println(num1<num2 && num1<num3?num1+" is lowest number":(num2<num1 && num2<num3?num2+" is lowest number":num3+" is lowest number"));
	}
}
