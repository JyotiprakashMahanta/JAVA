package boxing_unboxing_parsing;
/**
 *The process of converting Primitive data type value to Non primitive / Reference reference
 * by using valueof() is know as Boxing. 
 * 
 */
public class Boxing {
	public static void main(String[] args) {
		int i=90;
		Integer integer=Integer.valueOf(i);
		char c='J';
		Character c1=Character.valueOf(c);
		System.out.println(c1+"--> non primitive value");
		System.out.println(c+"-->  primitive value");
	}
}
