package boxing_unboxing_parsing;
/**
 * The process of converting string type into ant orther
 *   primitive data type except char is known as parsing.
 *   
 *    
 * */
public class Parsing {
	public static void main(String[] args) {
		String d="8.2";//non primitive type
		double e=Double.parseDouble(d);//it is a primitive type
		
		String string=new String("TrUe"); string.charAt(0);
		boolean b=Boolean.parseBoolean(string);
		System.out.println(b);
		
		String string2="10o82";
		try {
			int i=Integer.parseInt(string2);
			System.out.println(i);
		} catch (NumberFormatException e2) {
			System.out.println("error occure");
		}
	}
}
