/*

1
01
010
1010
10101

*/
class AlphaNumericPattern4 
{
	public static void main(String[] args) 
	{
		int num=0;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{ 
				num++;
				if (num%2==0)
				{
					System.out.print("0");
				}else{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
