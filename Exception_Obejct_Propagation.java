package Throwable;

public class Exception_Obejct_Propagation {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			run();
		} catch (ArithmeticException e) {
			System.out.println("AE Handled");
		}
		System.out.println("main end");
	}

	private static void run() {
		System.out.println("run start");
		walk();
		System.out.println("run end");
	}

	private static void walk() {
		System.out.println("walk start");
		System.out.println(10 / 0);
		System.out.println("walk end");
	}
}
