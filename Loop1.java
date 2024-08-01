/*
output:
---------
Aa
Bb
Cc
.
.
.
Zz
*/
class  Loop1
{
	public static void main(String[] args) 
	{
		char ch1='A',ch2='a';
		while (ch1<='Z')
		{
			System.out.println(ch1+""+ch2);
			ch1++;ch2++;
		}
	}
}
