package Non_Primitive_Array;

public class Laptop {
	String name;
	double storage;
	double price;
	int ram;
	public Laptop(String n,double s,double p,int r) {
//		super();
		// TODO Auto-generated constructor stub
		this.name=n;
		this.storage=s;
		this.price=p;
		this.ram=r;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", storage=" + storage + ", price=" + price + ", ram=" + ram + "]";
	}
}
