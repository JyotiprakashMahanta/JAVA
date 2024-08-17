/*

    *
   ***
  *****
 *******
    *
    *
    *
    * 
 *******
  *****
   ***
    *

*/
class StarParttern60 
{
	public static void main(String[] args) 
	{
		int space=4,star=-1;
		for (int i=1;i<=12 ;i++ )
		{
			if (i<=4)
			{
				space--;
				star+=2;
			}
			else if (i>9)
			{
				space++;
				star-=2;
			}
			if (i<=4)
			{
				for (int j=1;j<=space ;j++ )
				{
					System.out.print(" ");
				}
				for (int j=1;j<=star ;j++ )
				{
					System.out.print("*");
				}
			}
			else if(i>=5&&i<=8)
			{
				System.out.print("   *");
			}
			else
			{
				for (int j=1;j<=space ;j++ )
				{
					System.out.print(" ");
				}
				for (int j=1;j<=star ;j++ )
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
