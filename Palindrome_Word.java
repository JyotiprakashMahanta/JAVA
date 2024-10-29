
public class Palindrome_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hai madam hello malayalam";
		String[] str=s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String check=str[i];
			String res="";
			for (int j = 0; j < check.length(); j++) {
				res=check.charAt(j)+res;
			}
			if (check.equals(res)) {
				System.out.println(check);
			}
		}
	}

}
