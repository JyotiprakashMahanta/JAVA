import java.util.*;
class J
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int d;
		System.out.println("Enter a no.");
		d=s.nextInt();
		System.out.println(" "+d);
		int e,r,g=0;
		while(d!=0)
		{
			r = d%10;
			g = (g*10)+r;
			d = d/10;
		}
		System.out.println(g);
	}
}