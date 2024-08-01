class FebonericSeries 
{
	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		int res=0;
		System.out.println(num1);
		System.out.println(num2);
		while(true){
			if (res<=100)
			{
				res=num1+num2;
				if (res<=100)
				{
					System.out.println(res);
				}
			}else{
				break;
			}
			num1=num2;
			num2=res;
		}
	}
}
