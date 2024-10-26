package toString;

public class find_out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HHHH@@@1111()kuh";
		int ccount=0;
		int ncount=0;
		int scount=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				ccount++;
			}else if (s.charAt(i)-48>=1&&s.charAt(i)-48<=9) {
				ncount++;
			}else {
				scount++;
			}
		}
		System.out.println("The total alphabate present in String is "+ccount);
		System.out.println("The total number present in String is "+ncount);
		System.out.println("The total Special character present in String is "+scount);
	}

}
