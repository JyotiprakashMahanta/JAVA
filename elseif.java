import java.util.Scanner;

class J
{
    public static void main(String args[])
    {
        int kit;
        System.out.println("Enter mark:");
        Scanner s=new Scanner(System.in);
        kit=s.nextInt();
        if(kit>=60 && kit<=100)
        {
            System.out.println("First Division...");
        }
        else if(kit>=45 && kit<60)
        {
            System.out.println("Second Division...");
        }
        else if(kit>=30 && kit<45)
        {
            System.out.println("Thired Division...");
        }
        else 
        {
            System.out.println("Failed...");
        }
    }
}