/*

a
ab
abc
abcd
abcde

*/
class AlphaNumericPattern5 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			char ch=96;
			for (int j=1;j<=i ;j++ )
			{
				ch++;
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
