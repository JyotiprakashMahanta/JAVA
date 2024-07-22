import java.util.*;
class Posivenegative{
	public  static void main(String[] args){
		System.out.print("Entre a natural number:-  ");
		Scanner s=new Scanner(System.in);
		int o=s.nextInt();
		if(o>0){
			System.out.println("It is a positive number............");
		}
		else if(o<0){
			System.out.println("It is a negative number.........");
		}
		else{
			System.out.println("The number is Zero............");
		}
	}
}