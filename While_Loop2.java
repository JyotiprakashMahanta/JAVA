/*
Out Put:
---------
A1z
B2x
C3yc
.
.
.
.Z26a
*/
class While_Loop2 
{
	public static void main(String[] args) 
	{
		char ch1='A',ch2='z';
		int i=1;
		while (i<=26)
		{
			System.out.println(ch1+""+i+ch2);
			i++;ch1++;ch2--;
		}
	}
}
