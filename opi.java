import java.util.*;
class J
{
	public static void main(String args[])
	{
		Scanner op=new Scanner(System.in);
		System.out.print("Enter the value of i= ");
		int i=op.nextInt();
		System.out.print("Enter the value of j= ");
		int j=op.nextInt();
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("i= "+i+" j= "+j);
	}
}