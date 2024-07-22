import java.util.*;
class J
{
	public static void main (String args[])
	{
		Scanner cs=new Scanner(System.in);
		for(int i=1;i<=30;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("      *");
			}
			System.out.println("");
		}
	}
}