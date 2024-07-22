import java.util.*;
class Factorial 
{

    public static void main(String[] args)
	{
		System.out.println("Eneter a number: ");
		Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}