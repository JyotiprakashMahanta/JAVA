class Xyz 
{
	public static void main(String[] args) 
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(121);

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);

		int e=a+b+c+d;
		System.out.println(e);
	}
}
