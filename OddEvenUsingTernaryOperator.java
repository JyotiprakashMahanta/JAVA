//Check given number is even or odd by ternary opertor.
import java.util.Scanner;
class  OddEvenUsingTernaryOperator
{
	public static void main(String[] args) 
	{
		Scanner cs=new Scanner(System.in);
		int num=cs.nextInt();
		System.out.println(num%2==0?"even number":"odd number");
	}
}
