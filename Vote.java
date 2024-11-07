package Throwable;
public class Vote{
	public static void main(String[] args) {
		int age=19;
		if (18>age) {
			try {
				throw new Custom_Exception();
			}catch(Custom_Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("You can give Vote");
		}
	}
}
