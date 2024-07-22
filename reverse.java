import java.util.Scanner;

class J
{
    public static void main(String args[])
    {
        int i;
        System.out.println("Enter any number: ");
        Scanner y=new Scanner(System.in);
        i=y.nextInt();
        while(i>0)
        {
           int j=i%10;
            System.out.print(j);
            i=i/10;
        }
    }
}