package Non_Primitive_Array;

public class Bike {
	int id;
	String name;
	double price;
	Bike(int id,String name,double price){
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
