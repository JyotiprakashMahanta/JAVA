class D
{
	void sky()
	{
		System.out.println("JYOTIPRAKASH mahanta");
		String s1,s2,s3,s4;
		s1="    JYOTIPRAKASH mahanta";
		s2=s1.trim();
		s3=s1.toUpperCase();
		System.out.println(" after using trim class"+s2);
		System.out.println("aftre using upper case method"+s3);
		s4=s1.toLowerCase();
		System.out.println("after using lower case method"+s4);


	}
}
class K
{
	public static void main(String args[])
	{
		D fog=new D();
		fog.sky();
	}
}