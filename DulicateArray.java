class DuplicateArray
{
	public static void main(String[] args){
		int[] arr=new int[] {1,2,4,2,41,6,3,2,1};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j.arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
			}
		}
	}
}
