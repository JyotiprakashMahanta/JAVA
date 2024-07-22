class K
{
	int i;
	void box(int i)
	{
		this.i=i;
	}
	void rock()
	{
		System.out.println(i);
	}
}
class T
{
	public static void main(String args[] )
	{
		K k1=new K();
		k1.box(10);
		k1.rock();
	}
}