class Method44 
{
	public static void main(String[] args) 
	{
		double num=5;
		System.out.println(fact(num));
	}
	public static int fact(double ok){
		int fact=1;
		for (int i=1;i<=ok ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}
}
