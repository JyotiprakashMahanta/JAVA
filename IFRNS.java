class IFRNS{
	int x=10;
	{
		System.out.println("From NSB");
		System.out.println("x: "+x);
		System.out.println("y: "+this.y);
	}
	IFRNS(){
		System.out.println("\n From Constructor");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	public static void main(String[] args){
		System.out.println("From MM");
		IFRNS e=new IFRNS();
		System.out.println("Object loaded");
		System.out.println("x: "+e.x);
		System.out.println("y: "+e.y);
	}
	int y=20;
}
