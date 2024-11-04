package Throwable;

public class Exception_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		int[] a= {10,20,30};
		try {
			System.out.println("enter try block");
			System.out.println(a[0]/a[3]);
			System.out.println("end try block");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Catch ArrayIndexOutOfBoundException");
		}catch(Exception exception) {
			System.out.println("All exception");
		}
	}

}
