class DownCasting 
{
	public static void main(String[] args) 
	{
		
	}
}
class Example
{
	void m1(){
		System.out.println("m1");
	}
}
class Sample extends Example
{
	void m2(){
		System.out.println("m2");
	}
}
class Test
{
	public static void m3(Example e){
		e.m1();
		e.m2();
	}
}
