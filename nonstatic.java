class nonstatic
{
	int a=10;
	int b=20;
	void m1(){

		System.out.println(this.a);
		System.out.println(b);
		a=100;
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		nonstatic n1=new nonstatic();
		n1.m1();
	}
}
