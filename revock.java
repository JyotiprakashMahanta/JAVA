import java.util.Scanner;

class Satya
{
    public static void main(String args[])
    {
    int a;
    System.out.println("Enter the password:");
    Scanner s=new Scanner(System.in);

    a=s.nextInt();
    if(a==1234)
    {
        System.out.println("Welcome to Satya's World....");
    }
    else
    {
        System.out.println("Sorry incorrect password......");
    }
}}