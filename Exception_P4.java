package Throwable;

public class Exception_P4 {

	public static void main(String[] args) {
		System.out.println("main start");
		System.exit(0);
		try {
			System.out.println("try start");
			System.out.println(10/10);
			System.out.println("try end");
		}catch(Exception e) {
			System.out.println("error occure");
		}
		finally {
			System.out.println("enter to finally block");
			try {
				System.out.println(10/0);
			}catch(ArithmeticException e) {
				System.out.println("error occurs");
			}
		}
		System.out.println("main end");
	}

}
