
public class Max_Oval_Of_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ae aou jyoti au";
		String[] str=s.split(" ");
		String res=str[0];
		for (int i = 0; i < str.length; i++) {
			String temp=str[i];
			if (res.length()<maxOval(temp).length()) {
				res=temp;
			}
		}
		System.out.println(res);
	}

	private static String maxOval(String temp) {
		// TODO Auto-generated method stub
		String check="";
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i)=='a'||temp.charAt(i)=='e'||temp.charAt(i)=='i'||temp.charAt(i)=='o'||temp.charAt(i)=='u') {
				check=check+temp.charAt(i);
			}
		}
		return check;
	}

}
