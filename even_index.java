package toString;

public class even_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("Dipu");
		for(int i=0;i<name.length();i++) {
			if (i%2==0) {
				System.out.print(name.charAt(i)+", ");
			}
		}
	}

}
