
public class Largest_Word_Senetense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello I am Jyotiprakash Mahanta";
		String[] str=s.split(" ");
		String res=str[0];
		for (int i = 0; i < str.length; i++) {
			int count=0;
			String op=str[i];
			for (int j = 0; j < op.length(); j++) {
				if (res.length()<str[i].length()) {
					res=str[i];
				}
			}
		}
		System.out.println("The Largest word between the sentense is: "+res);
	}

}
