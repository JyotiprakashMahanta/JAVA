import java.util.Scanner;
class Prime_Number2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		int start=2;
		while (start<num)
		{
			if (num%start==0)
			{
				count++;
			}
			start++;
		}
		if(count==0 && num>=2)
		{
			System.out.println(num+" is a Prime number.");
		}else{
			System.out.println(num+" is not a Prime number.");
		}
	}
}
