package toString;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Dipu@339";
		int sum=0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i)>='0'&&name.charAt(i)<='9') {
				sum=sum+name.charAt(i)-48;
			}
		}
		System.out.println(sum);
	}

}
