
public class Special_Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="a0b2c9";
		for (int i = 0; i < name.length(); i++) {
			if (i%2==1) {
				int upto=name.charAt(i)-48;
				System.out.print(name.charAt(i-1)+"= ");
				for (int j = 0; j < upto; j++) {
					System.out.print(name.charAt(i-1));
				}
				System.out.println("("+name.charAt(i)+")");
			}		}
	}

}
