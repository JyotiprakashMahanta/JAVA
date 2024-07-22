import java.util.*;

class J {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter i= ");
        int i = s.nextInt();
        System.out.print("Enter j= ");
        int j = s.nextInt();
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("the value of i= " + i);
        System.out.println("the value of j= " + j);
    }
}