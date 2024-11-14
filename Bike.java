package Comprartor_Class_Work;

public class Bike {
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
}
