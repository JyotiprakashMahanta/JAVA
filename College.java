class College 
{
	public static void main(String[] args) 
	{
		//creating instance from class Student Rama and Hari Object 
		Student s1=new Student();
		Student s2=new Student();
		//initialization s1 instance with Ram object values
		s1.sno=101;
		s1.sname="Ram";
		s1.course="CJ";
		s1.fee=3500;

		//initialization s2 instance with Hari object values
		s2.sno=102;
		s2.sname="Hari";
		s2.course="Painting";
		s2.fee=5000;
		System.out.println("\ns1 object Values\n");
		System.out.println("s1.sno: \t"+s1.sno);
		System.out.println("s1.sname: \t"+s1.sname);
		System.out.println("s1.course: \t"+s1.course);
		System.out.println("s1.fee: \t"+s1.fee);
		System.out.println("\ns2 object Values\n");
		System.out.println("s2.sno: \t"+s2.sno);
		System.out.println("s2.sname: \t"+s2.sname);
		System.out.println("s2.course: \t"+s2.course);
		System.out.println("s2.fee: \t"+s2.fee);
	}
}
