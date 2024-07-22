			
public class Dem {
	int add(int a,int b) {
		int c =a+b;
		return c;
	}
	public static void main(String args[]) {
		int x =new Dem().add(10,20);
		System.out.println(x);
		Dem d=new Dem();
		int y =d.add(20, 5);
		System.out.println(y);
	}
}
