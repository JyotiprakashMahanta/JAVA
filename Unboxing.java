package boxing_unboxing_parsing;
/**
 * the process of converting non primitive reference back primitive value is know as unboxing.
 * since java 1.5 complier automically done unboxing so its is also called auto-unboxing  
 * */
public class Unboxing {

	public static void main(String[] args) {
		int i=100;
		Integer integer=Integer.valueOf(i);
		int j=integer.intValue();
		System.out.println(integer);//boxing
		System.out.println(j);//un-boxing
	}

}
