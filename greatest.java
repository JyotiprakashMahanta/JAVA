import java.util.Scanner;
class K
{
	void can()
	{
		int i,j,k;
		Scanner dipu=new Scanner(System.in);
		System.out.println("Enter 1st number number:");
		i=dipu.nextInt();
		System.out.println("Enter 2nd number number:");
		j=dipu.nextInt();
		System.out.println("Enter 3rd number:");
		k=dipu.nextInt();
		if(i>j && i>k)
		{
			System.out.println("Greatest number is: "+i);
		}
		else if(j>i && j>k)
		{
			System.out.println("Greatest number is: "+j);
		}
		else
		{
			System.out.println("Greatest number is: "+k);
		}
	}
}
class J
{
	public static void main(String args[])
	{
			K k1= new K();
			k1.can();
	}
}

