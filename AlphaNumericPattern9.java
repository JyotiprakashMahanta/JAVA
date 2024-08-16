class AlphaNumericPattern9 
{
	public static void main(String[] args) 
	{
		int space=3,num=-1;
		for (int i=1;i<=3 ;i++ )
		{
			int start=0;
			space--;
			num+=2;
			for (int j=1;j<=space ; j++)
			{
				System.out.print("  ");
			}
			for (int j=1;j<=num ;j++ )
			{
				start++;
				System.out.print(start+" ");
			}
			System.out.println();
		}
	}
}
