/*

1
12
123
1234
12345

*/

class AlphaNumericPattern3 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5; i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				int num=0;
				for (int k=1;k<=j ;k++ )
				{
					num++;
				}
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
