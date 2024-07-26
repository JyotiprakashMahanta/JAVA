//Given Alphabet iss lowercase or not.
import java.util.Scanner;
class AlphabetLowercase
{
	public static void main(String[] args) 
	{
		Scanner scc=new Scanner(System.in);
		char ch=scc.next().charAt(0);
	/*	if (ch>='a'&& ch<='z')
		{
			System.out.println("alphabet is lowercase");
		}else{
			System.out.println("alphabet is not lowercase");
		} */
		System.out.println(ch>='a' && ch<='z'?"alphabet is lowercase":"alphabet is not lowercase");
	}
}
