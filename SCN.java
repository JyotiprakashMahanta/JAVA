class A11
{
	static int a=10;
	int x=20;

	static{
		System.out.println("A is loaded..");
	}
}
class B11 extends A11
{
	static int b=30;
	int y=40;
	static{
		System.out.println("B is loaded..");
	}
}
class C11 extends A11
{
	static int b=50;
	int y=60;
	static{
		System.out.println("C is loaded..");
	}
}
class SCN 
{
	public static void main(String[] args) 
	{
		B11 b1=new B11();
		C11 c1=new C11();

		b1.a=15;
		b1.x=16;

		System.out.println("b1.a"+b1.a);
		System.out.println("c1.a"+c1.a);

		System.out.println("b1.x"+b1.x);
		System.out.println("c1.a"+c1.x);
	}
}
