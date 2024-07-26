//Given character is Alphabet or not.
import java.util.Scanner;
class  Char_Alphabet
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("It is a Alphabet");
		}else{
			System.out.println("It is not a Alphabet");
		}
	}
}
