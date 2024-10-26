package toString;

public class Vowel_String {
	public static void main(String[] args) {
		String name="Jyotiprakash Mahanta";
		String sname=name.toLowerCase();
		for (int i = 0; i < sname.length(); i++) {
			if(sname.charAt(i)=='a'||sname.charAt(i)=='e'||sname.charAt(i)=='i'||sname.charAt(i)=='o'||sname.charAt(i)=='u') {
				System.out.println(name.charAt(i)+" found in "+i+" index number");
			}
		}
	}
}
