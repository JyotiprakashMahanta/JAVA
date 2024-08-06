class  Prime_Number_Between_100_2500
{
	public static void main(String[] args) 
	{
		int num=100;
		while (num<=2500)
		{
			int count=0;
			int size=2;
			while (size<num)
			{
				if (num%size==0)
				{
					count++;
				}
				size++;
			}
			if (count==0 && num>1)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}
