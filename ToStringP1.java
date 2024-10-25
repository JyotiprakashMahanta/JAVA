import java.util.Arrays;

public class ToStringP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="dipu";
		String b="dipu";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.concat(" minu"));
		b=b+" himanshu";
		System.out.println(b);
		System.out.println(a);
		
		String name=new String("Jyoti");
		System.out.println(name);
		System.out.println(name.concat("Prakash"));
		
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('o'));
//		System.out.println(name.lastIndexOf('4'));
		System.out.println(name.isEmpty());
		System.out.println(name.isBlank());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		System.out.println(name.substring(3));
		System.out.println(name.substring(0, 5));
		char[] ch=name.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println(name.contains("Jy"));
		String n="  jyoti  prakash  ";
		System.out.println(n);
		System.out.println(n.trim());
		String[] str=n.split(" ");
		System.out.println(Arrays.toString(str));
		System.out.println(name.replace('J', 'M'));
		String name2="Jyoti";
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.compareTo(name2));
	}

}
