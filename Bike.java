package Comprable;

/**
 * 
 * It is an Interface which is present in java.lang package Which consist a
 * abstract method called compareTo() . Which is help the developer to perform
 * user define object sorting based on particular property
 * 
 * public int compareTo(Object o);
 * 
 * 
 * **--->An interface consist only one abstract method those Interface are know
 * as Functional Interface.
 * 
 * **--->An Interface which is consist zero abstract method is know as Marker
 * Interface.
 * 
 * If we want to sort user define Object sorting based on particular property we
 * should implements comparable Interface must be override with comparable
 * Interface must be override with compareTo() with following 3 cases
 * 
 * case-1: If current object property greater than passed property then it
 * returns a positive integer. case-2: If current object property less than
 * passed property then is returns a negative integer. case-3: If current object
 * property == passed object property then it returns zero.
 * 
 * Syntax:
 * 
 * public int compareTo(passed Object c){ if(this.pro>c.pro){ return positive;
 * }else if(this.pro<c.pro){ return negative; }else{ return zero; } }
 */
public class Bike implements Comparable<Bike> {
	int id;
	String brand;
	double price;

	public Bike(int id, String brand, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", brand=" + brand + ", price=" + price + "]\n";
	}

//	Case-1
//	@Override
//	public int compareTo(Bike o) {
//		if (this.price>o.price) {
//			return 1;
//		}else if (this.price<o.price) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
	
//	Case-2
//	@Override
//	public int compareTo(Bike o) {
//		// TODO Auto-generated method stub
//		return (int)(this.price-o.price);
//	}
	
	@Override
	public int compareTo(Bike o) {
		// TODO Auto-generated method stub
		return this.brand.compareTo(o.brand);
	}
}
