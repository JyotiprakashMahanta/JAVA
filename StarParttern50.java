class StarParttern50 
{
	public static void main(String[] args) 
	{
		/*

					
				****  ****
				***    ***
				**      **
				*        *

				*        *
				**      **
				***    ***
				****  ****
			*/

	/*	int start=5,space=0;
		for (int i=1;i<=9 ;i++ )
		{
			if (i<=5)
			{
				space+=2;
				start--;
			}else{
				start++;
				space-=2;
			}
			for (int j=1;j<=start ;j++ )
			{
				System.out.print("*");
			}
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=start ;j++ )
			{
				System.out.print("*");
			}  
			System.out.println();
			}
*/
/*			

    *
   **
  ***
 ****
  ***
   **
    *
*/
/*
			int space=5,star=0;
			for (int i=1;i<=7 ;i++)
			{
				if (i<=4)
				{
					space--;
					star++;
				}else{
					space++;
					star--;
				}
				for (int j=1;j<=space ;j++ )
				{
					System.out.print(" ");
				}
				for (int j=1;j<=star ;j++ )
				{
					System.out.print("*");
				}
				System.out.println();
			}

*/
/*

*
**
***
****
***
**
*

*//*
			int star=0;
			for (int i=1;i<=7 ;i++ )
			{
				if (i<=4)
				{
					star++;
				}else{
					star--;
				}
				for (int j=1;j<=star ;j++ )
				{
					System.out.print("*");
				}
				System.out.println();
			}

*//*


    *
   **
  *******
 ********
  *******
   **
    *
*//*
		int space=5,star=0;
		for (int i=1;i<=7 ;i++ )
		{
			if (i<=4)
			{
				star++;
				space--;
			}else{
				star--;
				space++;
			}
			for (int j=1;j<=space;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			for (int j=1;j<=4 ;j++ )
			{
				if (i==3||i==4||i==5)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

 *//*


	*
    **
*******
********
*******
    **
    *

*//*

		int star=0;
		for (int i=1;i<=7;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i==3||i==4||i==5)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			if (i<=4)
			{
				star++;
			}else{
				star--;
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}

*//*	

    *       *
    **     **
*******   *******
******** ********
*******   *******
    **     **
    *       *

*//*
		int space=5,star=0;
		int space2=9,star2=0;
		for (int i=1;i<=7 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i==3||i==4||i==5)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			if (i<=4)
			{
				star++;
			}
			else{
				star--;
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			if (i<=4)
			{
				space2-=2;
				star2++;
			}else{
				space2+=2;
				star2--;
			}
			for (int j=1;j<=space2 ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star2 ;j++ )
			{
				System.out.print("*");
			}
			for (int j=1;j<=4 ;j++ )
			{
				if (i==3||i==4||i==5)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
*//*


*****  *     ***** *       *  *****  *   *
  *    *     *   *  *     *   *      *   *
  *    *     *   *   *   *    *****  *   *
  *    *     *   *    * *     *      *   *
*****  ***** *****     *      *****  *****
 


*//*
		//I LOVE U
		int star=5,space=5;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=star ;j++ )
			{
				if (i==1||i==5||j==3)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			for (int j=1;j<=star ;j++ )
			{
				if (j==1||i==5)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=1;j<=star ;j++ )
			{
				if ((i==1||i==5||j==1||j==5))
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=1;j<=10 ;j++ )
			{
				if (i==j||i+j==10)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=1;j<=star ;j++ )
			{
				if (i==1||i==3||i==5||j==1)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.print(" ");
			System.out.print(" ");
			for (int j=1;j<=star ;j++ )
			{
				if (j==1||j==5||i==5)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
*//*

	*
   ***
  *****
 *******
*********
    *
    *
    *
    *
    *
*********
 *******
  *****
   ***
    *
*//*

		int space=5,star=-1;
		for (int i=1;i<=5 ;i++ )
		{
			space--;
			star+=2;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (j==5)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		int space2=-1,star2=11;
		for (int i=1;i<=5 ;i++ )
		{
			space2++;
			star2-=2;
			for (int j=1;j<=space2 ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star2 ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
*//*
	  *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
      *
      *
      *
      *
      *

*/

		int space=4,star=-1;
		for (int i=1;i<=7 ;i++ )
		{
			if (i<=4)
			{
				space--;
				star+=2;
			}else{
				space++;
				star-=2;
			}
			for (int j=1;j<=space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++ )
		{
			for (int j=1;j<=6 ;j++ )
			{
				if (j==6)
				{
					System.out.print(" *");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
