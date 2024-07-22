import java.util.*;
class Jyoti
{
	public static void main(String args[])
	{
				//void echo()
			int flo,eng,it,math,che,phy,total,percent;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the mark of Odia language: ");
			flo=sc.nextInt();
			System.out.print("Enter the mark of English language: "); 
			eng=sc.nextInt();
			System.out.print("Enter the mark of IT language: ");
			it=sc.nextInt();
			System.out.print("Enter the mark of MATH language: ");
			math=sc.nextInt();
			System.out.print("Enter the mark of Chemistry language: ");
			che=sc.nextInt();
			System.out.print("Enter the mark of Physics language: ");
			phy=sc.nextInt();
			total=flo+eng+it+math+che+phy;
			System.out.println("Total mark: "+total);
			percent=total/600*100;
			System.out.println(""+percent);
			if(total>500)
			{
				System.out.println("The grade is: A");
			}
			else
			{
				System.out.println("itz a fail student !!!!!!!!!!");
			}
	}
}
/*class J extends Jyoti
{
	public static void main(String args[])
	{
		echo j1=new echo();
	}
}*/