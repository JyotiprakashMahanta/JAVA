package Comprable;

import java.util.ArrayList;
import java.util.Collections;

public class BikeUser {
	public static void main(String[] args) {
		ArrayList<Bike> list=new ArrayList();
		list.add(new Bike(101, "tvs", 95));
		list.add(new Bike(201, "Himalayan", 280));
		list.add(new Bike(301, "Bmw", 300));
		list.add(new Bike(401, "ninja", 290));
		System.out.println("before sort\n=========");
		System.out.println(list);
		System.out.println("after sort\n===========");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("after sort\n===========");
		Collections.reverse(list);
		System.out.println(list);
	}	
}
