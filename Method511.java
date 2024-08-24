class Method511 
{
	public static void main(String[] args) 
	{
		int base=1;
		int pow=3;
		System.out.println(numPow(base,pow));		
	}
	public static int numPow(int base,int pow){
		int res=1;
		for (;pow>0; pow--)
		{
			res=res*base;
		}
		return res;
	}

}
