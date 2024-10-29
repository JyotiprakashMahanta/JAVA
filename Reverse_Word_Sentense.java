
public class Reverse_Word_Sentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JyotI PrakasH MahantA";
		String[] str=s.split(" ");
		String result="";
		for (int i = 0; i < str.length; i++) {
			String word=str[i];
			String rev="";
			for (int j = 0; j < word.length(); j++) {
				rev=word.charAt(j)+rev;
			}
			result=result+rev+" ";
		}
		System.out.println(result.trim());
	}

}
