
public class Possible_Palidrome {

	public static void main(String[] args) {
		String name="aikkiajojjo";
		System.out.println("All the possible Palidrome of String\n----------------------------------");
		for (int i = 0; i < name.length(); i++) {
			String temp=name.charAt(i)+"";
			for (int j = i+1; j < name.length(); j++) {
				temp=temp+name.charAt(j);
				if (temp.equals(rev(temp))) {
					System.out.println(temp);
				}
			}
		}
	}

	private static String rev(String temp) {
		// TODO Auto-generated method stub
		String rev="";
		for (int i = 0; i < temp.length(); i++) {
			rev=temp.charAt(i)+rev;
		}
		return rev;
	}

}
