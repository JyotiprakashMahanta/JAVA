/*

   #
  @@
 ###
@@@@

*/
class AlphaNumericPattern7 
{
	public static void main(String[] args) 
	{
		int num=0,space=4;
		for (int i=1;i<=4 ;i++ )
		{
			num++;
			space--;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i ;j++ )
			{
				if (num%2==1)
				{
					System.out.print("#");
				}else{
					System.out.print("@");
				}
			}
			System.out.println();
		}
	}
}
