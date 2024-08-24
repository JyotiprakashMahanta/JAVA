import java.util.Scanner;
class Method51 
{
	public static void main(String[] args) 
	{
		Scanner cs=new Scanner(System.in);
		int base=cs.nextInt();
		int pow=cs.nextInt();
		int res=res(base,pow);
		System.out.println(res);
	}
	public static int res(int base,int pow){
		int count=1;
		for (;pow!=0 ;pow-- )
		{
			count=count*base;
		}
		return count;
	}
}
