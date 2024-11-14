package Collection_Class;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * It is a build in class present in java.util package 
 * 
 * which consist set of static method and non-static method which help the developer to perform object sorting.
 * 
 * We can perform only homogeneous type of object sorting.
 * 
 *  If we try to perform heterogeneous type of object sorting then we will get ClassCastException.
 *  
 *  sort() method will sort only comparable type Object i.e class must be implement comparable interface and must 
 *  override compareTo() else we get CE.(Compile Time Error)
 * 
 * */
public class Collection_Class {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(-72);
		list.add(78720);
		list.add(0);
//		list.add(true);
		System.out.println("Before sort\n=========");
		System.out.println(list);
		System.out.println("\nAfter sort in assending order\n======");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("\nAfter sort in descending order\n======");
		Collections.reverse(list);
		System.out.println(list);
	}

}
