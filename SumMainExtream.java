import java.util.Scanner;
class SumMainExtream
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem,e=0,m=0;
		rem=num%10;
		e+=rem;
		num/=10;
		if (num>0)
		{
			int k=num;
			for (;k>9 ;k=k/10)
			{
				rem=k%10;
				m+=rem;
			}
			e+=k;
		}else{
			int k=num;
			for (;k<-9 ;k=k/10 )
			{
				rem=k%10;
				m+=rem;
			}
			e+=k;
		}
		System.out.println("e"+e);
		System.out.println("m"+m);
	}
}