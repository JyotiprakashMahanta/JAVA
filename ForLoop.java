class ForLoop 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=3;i++ )
		{
			System.out.print("*");
			for (int j=1;j<=4 ;j++ )
			{
				if (i==2 && j==2)
				{
					System.out.print("$");
				}else
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
