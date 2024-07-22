class AA 
{
	static AA a=new AA();
	// AA a=new AA(); // recursive constructor call
	AA(){
		System.out.println("constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method..");
		AA a=new AA();
	}
}
