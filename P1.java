package Non_Primitive_Array;

import java.util.Arrays;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the size of array: ");
//		int size=scanner.nextInt();
//		Bike[] bikes=new Bike[size];
		
//		1st Approch
//		System.out.println(bikes[0]);
//		Bike bike=new Bike(10, "Splendor", 21.2);
//		bikes[0]=bike;
//		System.out.println(bikes[0]);
		
//		2nd Approch
//		for (int i = 0; i < bikes.length; i++) {
//			System.out.println("enter id");
//			int id=scanner.nextInt();
//			System.out.println("enter brand");
//			String brand=scanner.next();
//			System.out.println("enter price");
//			double price=scanner.nextDouble();
//			bikes[i]=new Bike(id, brand, price);
//		}
//		System.out.println(Arrays.toString(bikes)+"\n");
		
//		3rd Approch
		Bike bike=new Bike(11, "TVS", 15000);
		Bike[] bikes2= {bike,new Bike(111, "Hero", 122.21),new Bike(999, "Honda", 1002.2)};
		for (int i = 0; i < bikes2.length; i++) {
			System.out.println(bikes2[i].id+" brand----->"+bikes2[i].name+" price---->"+bikes2[i].price);
		}
	}
}
