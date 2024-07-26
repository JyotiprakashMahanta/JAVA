import java.util.Scanner;
class  Check
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if ((ch>='0'&&ch<='9')||(ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			if (ch>='0' && ch=<'9')
			{
				System.out.println(ch+" It is digit");
			}else{
				System.out.println(ch+" It is alphabate");	
			}
		}
		else{
			System.out.println(ch+" It is Special Symbol out");
		}
	}
}
