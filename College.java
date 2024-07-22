import java.util.Scanner;
class College{

	public static void main(String[] args){
	
		Student s1=new Student();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter sno \t\t:");
		s1.sno	=sc.nextInt(); sc.nextLine();
		
		System.out.print("Enter sname \t\t:");
		s1.sname=sc.nextLine();
		
		System.out.print("Enter course \t\t:");
		s1.course	=sc.nextLine();
		
		System.out.print("Enter fee \t\t:");
		s1.fee	=sc.nextDouble();
		
		System.out.print("Enter email \t\t:");
		s1.email	=sc.next();
		
		System.out.print("Enter mobile \t\t:");
		s1.mobile	=sc.nextLong();
		
		System.out.print("Enter gender \t\t:");
		s1.gender	=sc.next().charAt(0);
		
		System.out.print("Enter studing \t\t:");
		s1.studing	=sc.nextBoolean();
		System.out.println("\nStudent Information:");
		System.out.println("sno \t\t\t :"+ s1.sno);
		System.out.println("sname \t\t\t :"+ s1.sname);
		System.out.println("course \t\t\t :"+ s1.course);
		System.out.println("fee \t\t\t :"+ s1.fee);
		System.out.println("email \t\t\t :"+ s1.email);
		System.out.println("mobile \t\t\t :"+ s1.mobile);
		System.out.println("gender \t\t\t :"+ s1.gender);
		System.out.println("studing \t\t\t :"+ s1.studing);
		
	}
}
