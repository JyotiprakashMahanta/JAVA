package Assignment;

public class ReverseString_Recursion {
	public static void main(String[] args) {
		String input="jyotiprakash";
		reverse(input);
	}

	private static void reverse(String input) {
		if (input.isEmpty()) {
			return;
		}else {
			reverse( input.substring(1));
			System.out.print(input.charAt(0));
		}
	}
}
