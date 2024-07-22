class Aaa {
	int x = m1();
	int m1(){
		System.out.println("Aaa m1");
		return 50;
	}
}
class B extends Aaa{
	int y= m1();
	int m1(){
		System.out.println("B m1");
		return 60;
	}
}