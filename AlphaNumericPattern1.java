class AlphaNumericPattern1
{
	public static void main(String[] args) 
	{
		int space=5,num=0;
		int jj=1;
		for (int i=1;i<=5 ;i++ )
		{
			space--;
			num++;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=num ;j++ )
			{
				if (i==1)
				{ 
					System.out.print(jj++);
				}
				else if (i==2){
					System.out.print("@");
				}
				else if (i==3)
				{
					System.out.print(jj++);
				}
				else if (i==4)
				{
					System.out.print("*");
				}else{
					System.out.print(jj++);
				}
			}
			System.out.println();
		}
	}
}
