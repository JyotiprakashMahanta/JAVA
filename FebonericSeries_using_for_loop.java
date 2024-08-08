class FebonericSeries_using_for_loop
{
	public static void main(String[] args){
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		int res=0;
		for (int go=0;go<=98 ;go++)
		{
			res=num1+num2;
			System.out.println(res);
			num1=num2;
			num2=res;
		}
	}
}
