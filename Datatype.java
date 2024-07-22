class Datatype 
{
	public static void main(String[] args) 
	{
		// 10
		// 10;
		// a=10;

		int a;
		a=10;
		System.out.println(a);

		// b=20;
		// System.out.println(b);
		
		int c=88;
		System.out.println(c);

		// int c=99;
		// System.out.println(c);
	
		 
		int d;
		//System.out.println(d);
		
		d=33; d=231 ;
		System.out.println(d);
		

		int e;
		e=10;
		// e=129290291122; //CE: integer number too large
        //e=1.9; // CE: incompatible types: possible lossy conversion from double to int      
        // e=true; // CE: incompatible types: boolean cannot be converted to int
		//e="a"; // CE: incompatible types: String cannot be converted to int
		
		System.out.println(e);
		
		int i1=12;
		int i2=88;
		System.out.println(i1+i2);
		System.out.println(i1<i2);
		System.out.println(i1>i2);
		
	//	System.out.println(i1&&i2); // CE: bad operand types for binary operator '&&'

	//Result Type
	//============
		double d1=21.9;
		System.out.println(i1+d1);
		int i3=i1+d1;
		// System.out.println(i3); // CE:  incompatible types: 
								   //possible lossy conversion from double to int
	}
}
