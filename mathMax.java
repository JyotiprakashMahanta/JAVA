package Day_11;

public class mathMax {
/*
 * Math.max() is a build in method that returns the largest value among the number you pass to it.
 * Syntax: Math(a,b);//take the two number and return greater one.
 * If we have nasted Math.max note Java's Math.max() accept only two value at a time. so for three number
 * 	ex:
 *  Mathmax(num1,Math.max(num2,num3));
 *  
 *  Same like Math.min in java.
 * 
 * 
 * 
 * */
	public static void main(String[] args) {
		int a=32;
		int b=23;
		int c=-43;
		int max=Math.max(a, Math.max(a, b));
		int min=Math.min(a, Math.min(b, c));
		System.out.println("max"+max+" min "+min);
	}
}
