
/*

a
b c
d e f
g h i j

*/
class AlphaNumericPattern6 
{
	public static void main(String[] args) 
	{
		char c=96;
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				c++;
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
