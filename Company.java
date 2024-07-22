class Company 
{
	public static void main(String[] args) 
	{
		//creating instance form the class Empolyee for Ram and Dam 

		Empolyee e1=new Empolyee();// for Ram
		//initilization e1 instance with Ram object values

		Empolyee e2=new Empolyee();//for Dam
		//initilization e2 instance with Ram object values
		
		e1.eno=201;
		e1.ename="Jyotiprakash.....";
		e1.salary=23000;
		e1.dept="Java Dev.";

		e2.eno=202;
		e2.ename="Satya........";
		e2.salary=25000;
		e2.dept="UI Dev.";

		System.out.println("\ne1 object value\n");
		System.out.println("e1.eno: \t"+e1.eno);
		System.out.println("e1.ename: \t"+e1.ename);
		System.out.println("e1.salary: \t"+e1.salary);
		System.out.println("e1.dept: \t"+e1.dept);

		System.out.println("\ne1 object value\n");
		System.out.println("e2.eno: \t"+e2.eno);
		System.out.println("e2.ename: \t"+e2.ename);
		System.out.println("e2.salary: \t"+e2.salary);
		System.out.println("e2.dept: \t"+e2.dept);
	}
}








