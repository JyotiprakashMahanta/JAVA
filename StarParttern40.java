class StarParttern40 
{
	public static void main(String[] args) 
	{
		int star=0,space=4;
		for (int i=1;i<=4 ;i++ )
		{
			space--;
			star++;
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
	}
}