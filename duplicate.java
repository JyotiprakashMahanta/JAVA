import java .util.*;
class K
{
	void fan()
	{
		Scanner se= new Scanner(System.in);
		System.out.println("ENTER A WORD:");
		String str=se.next();
		String S="";
		for(int j=0;j<str.length();j++)
		{
			char cr=str.charAt(j);
			if(cr!=' ') 
			{
				S=S+cr;
				str=str.replace(cr, ' ') ;
			}
		}
		System.out.println("The word is: "+S);
	}
}
class J 
{
	public static void main(String dipu[])
	{
		K k1=new K();
		k1.fan();
	}
}