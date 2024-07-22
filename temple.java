class Parent
{
	String name="karismita";
	void display()
	{
		System.out.println(name);
	}
}
class Child extends Parent
{
	int age =20;
	void display()
	{
		System.out.println(age);
	}
}
class Show
{
	public static void main(String args[])
	{
		Parent p1=new Child();
		//p1.name="karismita";
		//System.out.println(p1.name);
		//p1.display();
		Child c=(Child ) p1;
		//c.age=50;
		System.out.println(c.age);
		System.out.println(c.name);
	}
}
