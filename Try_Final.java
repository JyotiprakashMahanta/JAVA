package Throwable;

public class Try_Final {

	public static void main(String[] args) {
		try {
			int res=10/0;
			System.out.println(res);
		}finally {
			System.out.println("working propely");
		}
	}

}
