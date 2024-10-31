package Day6;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {21,43,11,-3,2,0,0};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int x=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("}");
	}

}
