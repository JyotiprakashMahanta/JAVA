class  Subject
{
	void Box()
	{
		String s1,s2,s3;
		s1="Karismita";
		s2=s1.substring(5);
		System.out.println(s2);
		s3=s1.substring(1,7);
		System.out.println(s3);
	}

}
class Dis
{
	public static void main(String args[])
	{
		Subject u1=new Subject();
		u1.Box();
	}

}