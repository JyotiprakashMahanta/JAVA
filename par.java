class Param
{
	void  Box()
	{
		String s1,s2;int i;
		s1="Rupa";
		s2="Karismita" ;
		i=Integer.parseInt("10");
		System.out.println(s1+"\n"+s2+"\n"+i);
	}
}
class  Dis
{
	public static void main(String args[] )
	{
		Param p1=new Param();
		p1.Box();
	}
}