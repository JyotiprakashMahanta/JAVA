package Comprartor_Class_Work;

import java.util.Comparator;

public class PriceCompHC implements Comparator<Bike> {
	public int compare(Bike bike1, Bike bike2) {
		if (bike1.price > bike2.price) {
			return 1;
		} else if (bike1.price < bike2.price) {
			return -1;
		} else {
			return 0;
		}
	}
}
