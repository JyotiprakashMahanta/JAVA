//package super_method_dot;

public class Laptop {
	String brand;
	double price;
	String color;
	boolean avi;
	public Laptop(String brand,double price,String color,boolean avi){
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.avi=avi;
	}
	Laptop(String brand,double price,boolean avi){
		this.brand=brand;
		this.price=price;
		this.avi=avi;
	}
	void details() {
		System.out.println("name: "+this.brand);
		System.out.println("price: "+this.price);
		if (color!=null)
		{
			System.out.println("color: "+this.color);
		}
		System.out.println("avilable: "+this.avi);
		System.out.println("\n\n=================================================\n");
	}
}
