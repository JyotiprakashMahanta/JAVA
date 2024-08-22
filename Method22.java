class Method22 
{
	public static void add(){
		int a=3,b=5;
		System.out.println("the addition of "+a+" and "+b+" is "+(a+b));
		let();
	}
	public static void mul(){
		add();
		int a=10,b=3;
		System.out.println("the multification of "+a+" and "+b+" is "+(a*b));
	}
	public static void main(String[] args) 
	{
		mul();
		//add();
	}
	public static void let(){
		System.out.println("Calling method from add method");
	}
}
