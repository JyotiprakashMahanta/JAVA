// Given Alphabet character is vowel or consonant.
import java.util.Scanner;
class  Alphabet_Character_Vowel_Consonant
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char h=sc.next().charAt(0);
		char ch=Character.toLowerCase(h);
	/*	if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		{
			System.out.println("it is vowel");
		}else{
			System.out.println("it is consonant");
		} */
		System.out.println(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'?"vowel":"consonant");
	}
}
