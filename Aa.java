class Aa{
	int x=m1();
	static int m1(){
		System.out.println("A m1");
		return 50;
	}
}
class B extends Aa{
	int y=m1();
	static int m1(){
		System.out.println("B m1");
		return 60;
		}
}
