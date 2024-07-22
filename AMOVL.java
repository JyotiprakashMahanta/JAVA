class AMOVL{
	int x=m1();
	int m1(){
		System.out.println("A m1");
		x=50;
		return 60;
	}
}

class B extends A{
	int x;
	int m1(){
		System.out.println("B m1");
		x=70;
		return 80;
} 


