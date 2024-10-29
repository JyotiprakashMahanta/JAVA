
public class Distnct_Character {

	public static void main(String[] args) {
		String s="jyotiprakash";
		String res="";
		for (int i = 0; i < s.length(); i++) {
			if (res.indexOf(s.charAt(i))==-1) {
				res=res+s.charAt(i);
			}
		}
		System.out.println(res);
	}

}
