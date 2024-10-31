package toString;

public class anagram {
	public static void main(String[] args) {
		String s1="arclad";
		String s2="clarza";
		if (s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			sort(c1);
			sort(c2);
			int count=0;
			for (int i = 0; i < c2.length; i++) {
				if (c1[i]==c2[i]) {
					count++;
				}else {
					System.out.println("not a angram");
					break;
				}
			}
			if (count==s1.length()) {
				System.out.println("it is a angram");
			}
		}else {
			System.out.println("It is not a angram");
		}
	}

	private static void sort(char[] s1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1.length-1-i; j++) {
				if (s1[j]>s1[j+1]) {
					char c=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=c;
				}
			}
		}
	}
}
