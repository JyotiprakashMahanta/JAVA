package Day6;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70,80,90};
		bubbleSort(arr);
		int find=20;
		int s=0;
		int l=arr.length-1;
		int mid=0;
//		mid
		while(s<=l) {
			mid=s+l/2;
			if (arr[mid]==find) {
				System.out.println("Element found at "+mid+" index number");
				return;
			}else if (arr[mid]>l) {
				l=l-1;
			}else {
				l=l+1;
			}
		}
		System.out.println("can not find "+find+" from this array");
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int x=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
//		System.out.println(arr[0]);
	}

}
