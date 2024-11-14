package Comprartor_Class_Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bike_User {

	public static void main(String[] args) {
		List<Bike> list = new ArrayList<Bike>();
		list.add(new Bike(31, "aBMW", 32.5));
		list.add(new Bike(2, "Himalayan", 305.1));
		list.add(new Bike(183, "Ninja", 42.6));
		list.add(new Bike(18, "unicorn", 13.2));
		Comparator<Bike> comparator = new BrandCompHC();
		Scanner scanner = new Scanner(System.in);
		int exit=1;
		while (exit!=0) {
			System.out.println("Enter your choice for sort\n 1 for id\n 2 for brand\n 3 for price");
			String num = scanner.next();
			String wise="Brand";
			if (num.equals("1")) {
				wise="ID";
				comparator = new IDCompHC();
			} else if (num.equals("2")) {
				wise="Brand";
				comparator = new BrandCompHC();
			} else if (num.equals("3")) {
				wise="Price";
				comparator = new PriceCompHC();
			} else {
				System.out.println("You choice Invalid option Object are Arranged in Brandwise.");
			}
			
			System.out.println("before sorting\n=============");
			System.out.println(list);
			Collections.sort(list, comparator);
			System.out.println(wise+" sorting\n=============");
			System.out.println(list);
			System.out.println("Enter 0 for exit from loop");
			exit=scanner.nextInt();
		}
	}

}
