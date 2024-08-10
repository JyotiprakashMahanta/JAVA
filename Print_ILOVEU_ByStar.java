class Print_ILOVEU_ByStar 
{
	public static void main(String[] args) 
	{
		// I

		for (int i=1;i<=10 ;i++ )
		{
			for (int j=1;j<=10 ;j++ )
			{
				if (j==5||i==1||i==10)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
		System.out.println("\n\n\n");

		//L

		for (int i=1;i<=10 ;i++)
		{
			for (int j=1;j<=10 ;j++)
			{
				if (i==10||j==1)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
		System.out.println("\n\n\n");

		//O
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=1;j<=10 ;j++ )
			{
				if (((i==1||i==6)&&j==5)||i==2&&(j==2||j==8)||(j==1&&(i==3||i==4))||i==5&&(j==2||j==8)||j==9&&(i==3||i==4))
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
		System.out.println("\n\n\n");

		//V
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=10 ;j++ )
			{
				if ((i==j)||(i+j==10))
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		//E

		for (int i=0;i<=10 ;i++ )
		{
			for (int j=1;j<=10 ;j++ )
			{
				if (j==1||i==0||i==5||i==10)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n\n\n");

		//U

		for (int i=1;i<=10 ;i++ )
		{
			for (int j=1;j<=10 ;j++ )
			{
				if (i==10||j==1||j==10)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");		
				}
			}
			System.out.println();
		}	
		System.out.println("\n\n\n");
	}
}
