package toString;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="jyotiprakasH";
		String res="";
//		for (int i = 0; i < name.length(); i++) {
//			res=name.charAt(i)+res;
//		}
		for (int i = name.length()-1; i > -1; i--) {
			res=res+name.charAt(i);
		}
		System.out.println(res);
	}

}
