import java.util.*;
class S
{
	void Test()
	{
		int i,j,k;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		i=a.nextInt();
		System.out.println("Enter 2nd Number:");
		j=a.nextInt();
		System.out.println("Eneter 3rd Number:");
		k=a.nextInt();
		if(i>j && i>k)
		{
			System.out.println("The Greatest Number is:"+i);
		}
		else if(j>i && j>k)
		{
			System.out.println("The Greatest Number is:"+j);
		}
		else
		{
			System.out.println("The Greatest Number is:"+k);
		}
	}
}
class J
{
	public static void main(String arfs[])
	{
		S s1=new S();
		s1.Test();
	}
}