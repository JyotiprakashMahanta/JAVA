class StarPrintTask1 
{
	public static void main(String[] args) 
	{
		int n=0;
		for (int i=1;i<=10 ;i++ )
		{
			if (i<=5)
			{
				n++;
			}else{
				n--;
			}
			for (int j=1;j<=n ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
