package Comprartor_Class_Work;

import java.util.Comparator;

public class IDCompHC implements Comparator<Bike> {

	@Override
	public int compare(Bike b1, Bike b2) {
		if (b1.id > b2.id) {
			return 1;
		} else if (b1.id < b2.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
