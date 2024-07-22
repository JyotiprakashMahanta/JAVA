import java.util.*;;
class J
{
	public static void main(String args[])
	{
		System.out.println("Before Swap:-");
		System.out.println("Enter 1st Number: ");
		Scanner ya=new Scanner(System.in);
		int i=ya.nextInt();
		System.out.println("Enter 2nd number: ");
		int j=ya.nextInt();
		int k=i;
		i=j;
		j=k;
		System.out.println("After swap:-");
		System.out.println("This is the 1st number: "+i);
		System.out.println("this is the 2nd number: "+j);
	}
}