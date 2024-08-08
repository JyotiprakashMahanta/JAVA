//Prime_Number_Between_100_2500
class  Prime_Number_Between_100_2500
{
	public static void main(String[] args) 
	{
		int num=100;
		for(;num<=2500;num++)
		{
			int count=0;
			int size=2;
			for(;size<num;size++)
			{
				if (num%size==0)
				{
					count++;
				}
			}
			if (count==0 && num>1)
			{
				System.out.println(num);
			}
		}
	}
}