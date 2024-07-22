	class Par
{
	void getval()
	{
		System.out.println("method of PARENT class ");
	}
}
class Child extends Parent
{
	void getval()
	{
		System.out.println("Method of child class");
	}
}
class display
{
	public static void main(String ards[])
	{
		Parent p1=(Parent)new Child();
		Parent p2=(Parent)new Child();
		p1.getval();
		p2.getval();
	}
}