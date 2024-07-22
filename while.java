import java.util.Scanner;

class J {
	public static void main(String args[]) {
		int num;
		System.out.println("Enter a number:");
		Scanner it = new Scanner(System.in);
		num = it.nextInt();
		while (num >= 0) {
			if (num % 2 == 0) {
				System.out.println("Even Number...");
				break;
			} else {
				System.out.println("Odd Number....");
				break;
			}
		}
	}
}