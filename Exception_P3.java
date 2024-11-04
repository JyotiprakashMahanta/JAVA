package Throwable;

public class Exception_P3 {

	public static void main(String[] args) {
		System.out.println("main strat");
		int[] num= {10,30,0,50};
		try {
			System.out.println("enter into try");
			System.out.println(num[1]+num[3]);
			System.out.println("operation sucefully execute");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index number mismatch");
		}catch(ArithmeticException exception) {
			System.out.println("arithematic exception occurs");
		}
		System.out.println("main end");
	}

}
