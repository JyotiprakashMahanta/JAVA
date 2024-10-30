
public class Special_Case {

	public static void main(String[] args) {
		String name="a2b4c0d5";
		for (int i = 0; i < name.length(); i++) {
			int upto=name.charAt(i+1)-48;
			System.out.print(name.charAt(i)+"= ");
			for (int j = 0; j < upto; j++) {
				System.out.print(name.charAt(i)+" ");
			}
			System.out.println();
			i++;
		}
	}

}
