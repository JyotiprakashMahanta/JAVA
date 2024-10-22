package Non_Primitive_Array;

public class Laptop_User_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop3=new Laptop("I-mac", 1000, 1300.4,92 );
		Laptop[] laptop= {new Laptop("Asus", 510, 408000, 21),new Laptop("Del", 1000, 499021, 19),laptop3};
//		System.out.println(laptop[0]+",\n "+laptop[1]);
//		task-1
		double sum=0;
		for (int i = 0; i < laptop.length; i++) {
			sum=sum+laptop[i].price;
		}
//		System.out.println("length    ---"+laptop.length);
		double avg=sum/laptop.length;
		System.out.println("The average price of all laptop: "+avg);
		
//		task-2
		int count=0;
		for (int i = 0; i < laptop.length; i++) {
			if (laptop[i].price>=avg) {
				count++;
			}
		}
		String[] res=new String[count];
		int index=0;
		for (int i = 0; i < laptop.length; i++) {
			if (laptop[i].price>=avg) {
				res[index]=laptop[i].name;
				index++;
			}
		}
		System.out.print("The above price to avg price: ");
		for (String string : res) {
			System.out.print(string+", ");
		}
		System.out.println();
//		task-3
		int count2=0;
		for (int i = 0; i < laptop.length; i++) {
			if (laptop[i].name.charAt(0)=='a'||laptop[i].name.charAt(0)=='e'||laptop[i].name.charAt(0)=='i'||laptop[i].name.charAt(0)=='o'||laptop[i].name.charAt(0)=='u') {
//				System.out.println("ok");
				System.out.println(laptop[i]);
				count2++;
			}
		}
		if (count2==0) {
			System.out.println("not available any laptop an vowels");
		}
		
//		task-4
		double costely=laptop[0].price;
		for (int i = 0; i < res.length; i++) {
			if (laptop[i].price>costely) {
				costely=laptop[i].price;
			}
		}
		System.out.println("the most expensive laptop is :"+costely);
	}

}
