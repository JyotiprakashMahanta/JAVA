//Given Alphabet character uppercase or lowercase.
import java.util.Scanner;
class  UpperCase_LowerCase
{
	public static void main(String[] args) 
	{
		Scanner cs=new Scanner(System.in);
		char ch=cs.next().charAt(0);
		if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			if (ch>='A' && ch<='Z')
			{
				System.out.println(ch+" is UpperCase Letter");
			}
			else 
			{
				System.out.println(ch+" is LowerCase Letter");
			}
		}
		
	}
}
