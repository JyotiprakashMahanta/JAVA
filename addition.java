import java.util.*;
class J
{
    public static void main(String args[])
    {
        int i,j,k=0;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        System.out.println("Enter another a number:");
        j=sc.nextInt();
        k=i+j;
        System.out.println("The addition is:"+k);
    }
}