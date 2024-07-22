import java.util.Scanner;

class J
{
    public static void main(String args[])
    {
        int op;
        System.out.println("Enter your age:");
        Scanner sc=new Scanner(System.in);
        op=sc.nextInt();
         if(op>=18)
        {
            System.out.println("You are eligible ..");
        }
        else
        {
            System.out.println("Sorry ! you are not eligible...");
        }   
    }
}