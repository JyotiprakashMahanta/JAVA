import java.util.Scanner;
class  Prime_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();;
		int count=0;
		int start=2;
		while (start<num/2)
		{
			if (num%start==0)
			{
				count++;
			}
			start++;
		}
		if (count==0 && num>=2)
		{
			System.out.println(num+" is prime no.");
		}else{
			System.out.println(num+" is not a prime no.");
		}
		
	}
}
