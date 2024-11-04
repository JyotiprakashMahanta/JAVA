package Throwable;

public class Exception_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		try {
			System.out.println("try start");
			System.out.println(10/0);
			System.out.println("try end");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException Occure in Program");
		}
	}

}
