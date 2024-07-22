import java.util.Scanner;

class J
{
    public static void main(String args[])
    {
        int pwt;
        System.out.println("Enter your password:");
        Scanner sc=new Scanner(System.in);
        pwt=sc.nextInt();
        if(pwt==9035)
        {
            System.out.println("Welcome to Dipu's World");
        }
        else
        {
            System.out.println("Sorry ! Wrong Password......");
        }
    }
}