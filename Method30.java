//method declaration with formal argument
import java.util.Scanner;
class Method30
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt(),z=sc.nextInt();
		add(y,z);
	}
	public static void add(int a,int b){
		int c=a+b;
		System.out.println("The Addition is "+c);
	}
}
