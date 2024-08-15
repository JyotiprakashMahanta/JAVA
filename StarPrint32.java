class StarPrint32 
{
	public static void main(String[] args) 
	{
		int star=0;
		for (int i=1;i<=8 ;i++ )
		{
			if (i<=4)
			{
				star++;
			}else{
				star--;				
			}
			for (int j=1;j<=star ;j++ )
			{
				if (i==4&&j==2)
				{
					System.out.print("@");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//System.out.println("Hello World!");
	}
}
