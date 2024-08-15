import java.util.Scanner;
class BinaryValue
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String s="";
		while (num>0)
		{
			int rem=num%2;
			s=rem+s;
			num/=2;
		}
		System.out.println(s);
	}
}