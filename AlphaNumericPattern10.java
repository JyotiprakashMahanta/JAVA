/*
      1
    a b c
  1 2 3 4 5
a b c d e f g

*/
class AlphaNumericPattern10 
{
	public static void main(String[] args) 
	{
		int space=4;
		int alpha=-1;
		for (int i=1;i<=4 ;i++ )
		{
			space--;
			alpha+=2;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print("  ");
			}
			int num=0;
			char ch=96;
			for (int j=1;j<=alpha ;j++ )
			{
				num++;
				ch++;
				if (i%2==1)
				{
					System.out.print(num+" ");
				}else{
					System.out.print(ch+" ");
				}
			}
			System.out.println();
		}
	}
}
