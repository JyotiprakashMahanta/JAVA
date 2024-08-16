class StarPrintTask2 
{
	public static void main(String[] args) 
	{
		int n=10;
		for (int i=1;i>0 ;i-- )
		{
			if (i>0)
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
