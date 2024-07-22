class Aaaa{
	static int x=m1();
	static int m1(){
		System.out.println("Aaaa m1");
		x=50;
		return 60;
	}
}
class Bo extends Aaaa{
	static int x;
	static int m1(){
		System.out.println("B m1");
		x=70;
		return 80;
	}
}
