class A
{
}class B extends A
{
}
class C extends B
{
}
class D 
{
}
class InstanceOf 
{
	public static void main(String[] args) 
	{
		//Object obj=new Object();
		A a =new B();
		System.out.println(a instanceof Object);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		//System.out.println(a instanceof D);

		Object b=new B();
		System.out.println("\n\n"+a instanceof Object);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		//System.out.println(a instanceof D);
	}
}
