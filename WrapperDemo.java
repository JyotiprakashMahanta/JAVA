package boxing_unboxing_parsing;

public class WrapperDemo {
	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		System.out.println(">>>>>>>>>>Boxing<<<<<<<<");
		Integer integer=new Integer(i);
		Integer integer2=Integer.valueOf(i);
		char c='m';
		Character character=new Character(c);
		Character character2=Character.valueOf(c);
		System.out.println(">>>>>>>>>>Un-boxing<<<<<<<<");
		char d='K';
		Character character3=d;//auto-boxing
		char e=character3.charValue();//un-boxing
		char f=character3;//auto-unboxing
		
		boolean b=true;//primitive value
		Boolean boolean1=b;//non primitive reference auto-boxing
		boolean g=boolean1;//primitive value auto-unboxing
		
	}
}
