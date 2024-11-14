package Comprartor_Class_Work;

import java.util.Comparator;

public class BrandCompHC implements Comparator<Bike>{

	@Override
	public int compare(Bike b1, Bike b2) {
		return b1.brand.compareTo(b2.brand);
	}
	
}
