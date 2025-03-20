package ArrayLogical;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 3, 3, 3, 3, 3, 3 };
		int max = Integer.MIN_VALUE;
		int s_max = Integer.MIN_VALUE;
		if (arr.length < 2) {
			System.out.println("Array must contain atleast two elements..");
			return;
		}
		for (int i : arr) {
			if (max < i) {
				s_max = max;
				max = i;
			} else if (s_max < i && i < max) {
				s_max = i;
			}
		}
		System.out.println(s_max == Integer.MIN_VALUE ? "no second maximun" : "second maximum is: " + s_max);
	}
}