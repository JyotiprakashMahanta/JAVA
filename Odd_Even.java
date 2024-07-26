// Given number is EVEN or ODD using conditional operator.
import java.util.Scanner;
class  Odd_Even
{
	public static void main(String[] args) 
	{
		Scanner cs=new Scanner(System.in);
		int num=cs.nextInt();
		if (num%2==0)
		{
			System.out.println(num+" number is even");
		}else{
			System.out.println(num+" number is odd");
		}
	}
}
