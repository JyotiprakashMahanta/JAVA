/*
    a
   12
  abc
 1234

*/
class AlphaNumericPattern8 
{
	public static void main(String[] args) 
	{
		int space=5;
		for (int i=1;i<=4 ;i++ )
		{
			space--;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			char c=96;
			int num=0;
			for (int j=1;j<=i ;j++ )
			{
				c++;
				num++;
				if (i%2==1)
				{
					System.out.print(c);
				}else{
					System.out.print(num);
				}
			}
			System.out.println();
		}
	}
}
