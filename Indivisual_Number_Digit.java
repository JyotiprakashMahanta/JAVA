class Indivisual_Number_Digit 
{
	public static void main(String[] args) 
	{
		int num=2^9;
		int count=0;
		while (num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
	}
}