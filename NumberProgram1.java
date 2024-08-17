/*
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
  1 2 3 2 1
    1 2 1
      1
*/
class NumberProgram1 
{
	public static void main(String[] args) 
	{
		int space=4,star=-1;
		for (int i=1;i<=7 ;i++ )
		{
			int num=1;
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
			//int num=1;
			for (int j=1;j<=star ;j++ )
			{
				if (i<=j || i==5&&(j==3||j==4) || i==6&&j==2)
				{
					System.out.print(num--+" ");
				}
				else
					System.out.print(num+++" ");
			}
			System.out.println();
		}
	}
}
