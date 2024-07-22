class  Equal
{
	void Box()
	{
		String s1,s2,s3;
		s1="Karismita";
		s2="rupa";
		s3="Rupa";
		boolean b1=s1.equalsIgnoreCase(s2);
		boolean b2=s2.equalsIgnoreCase(s3);
		System.out.println(b1);
		System.out.println(b2);
	}

}
class Dis
{
	public static void main(String args[])
	{
		Equal c1=new Equal();
		c1.Box();
	}

} 