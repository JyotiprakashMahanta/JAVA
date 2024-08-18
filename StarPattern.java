class StarPattern 
{
	public static void main(String[] args) 
	{
		/* start-1

		*****
		****
		***
		**
		*

		
		int space=-1,star=6;
		for (int i=1;i<=5 ;i++ )
		{
			space++;
			star--;
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		end-1 */

		/*start-2
		
*****
 ****
  ***
   **
    *

		
		int star=6,space=-1;
		for (int i=1;i<=5 ;i++ )
		{
			star--;
			space++;
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
		end-2 */

		/*start-3

 *********
  *******
   *****
    ***
     *
		
		int star=11,space=0;
		for (int i=1;i<=5 ;i++ )
		{
			star-=2;
			space++;
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
		end3 */
		/*star4
		
*****
 *****
  *****
   *****
    *****

		
		int space=-1;
		for (int i=1;i<=5 ;i++ )
		{
			space++;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			System.out.print("*****");
			System.out.println();
		}
		end4*/
		/* start5
		
	*
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
		
		int space=5,star=0;
		for (int i=1;i<=9 ;i++ )
		{
			if (i<=5)
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
				System.out.print("* ");
			}
			System.out.println();
		}
		end-5*/
		/*start-6

* * * *
 * * *
  * *
   *
  * *
 * * *
* * * *
		
		int space=-1,star=5;
		for (int i=1;i<=7 ;i++ )
		{
			if (i<=4)
			{
				space++;
				star--;
			}else{
				space--;
				star++;
			}
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		end-6*/
		/*start-7

 * * * * *
 *       *
 *       *
 *       *
 * * * * *

		
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==1||i==5||j==1||j==5)
				{
					System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		end-7*/
		/*start-8

	 *
    * *
   *   *
  *     *
 * * * * *
		
		int space=6,star=0;
		for (int i=1;i<=5 ;i++ )
		{
			space--;
			star++;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				if (i==5||j==1||j==star)
				{
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		end-9*/
		/*start-10

* * * * * * * * *
  *           *
    *       *
      *   *
        *
		
		int space=-1,star=11;
		for (int i=1;i<=5 ;i++ )
		{
			space++;
			star-=2;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=star ;j++ )
			{
				if (i==1||j==1||j==star)
				{
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
		end-10*/
		/*start-11

      *
    *   *
  *       *
*           *
  *       *
    *   *
      *
	

		 
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
			 for (int j=1;j<=space;j++ )
			 {
				 System.out.print("  ");
			 }
			 for (int j=1;j<=star ;j++ )
			 {
				 if (j==1||j==star)
				 {
					 System.out.print("* ");
				 }else{
					System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }
		 end-11*/
		 /*start-12 
		 
		 end-12*/
		 int star=5,space=-1;
		 for (int i=1;i<=7 ;i++ )
		 {
			 if (i<=4)
			 {
				 space++;
				 star--;
			 }else{
				space--;
				star++;
			 }
			 for (int j=1;j<=space ;j++ )
			 {
				 System.out.print(" ");
			 }
			 for (int j=1;j<=star ;j++ )
			 {
				 if ((i==2||i==6)&&j==2)
				 {
					 System.out.print("  ");
				 }else{
					System.out.print("* ");
				 }
			 }
			 System.out.println();
		 }
	}
}
