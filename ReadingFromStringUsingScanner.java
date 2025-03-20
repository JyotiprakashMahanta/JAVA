package Revision;

import java.util.Scanner;

public class ReadingFromStringUsingScanner {
	public static void main(String[] args) {
		String msg="Dipu 23 MCA";
		Scanner scanner=new Scanner(msg);
		String text=scanner.next();
		int number=scanner.nextInt();
		String text2=scanner.nextLine();
		System.out.println("name is:"+text+"\n"+" age is:"+number+"\n Qulification:"+text2);
		scanner.close();
	}
}
