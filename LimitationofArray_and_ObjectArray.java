package boxing_unboxing_parsing;

import java.util.Iterator;

public class LimitationofArray_and_ObjectArray {
/**
 * 1-Array is fixed length i.e ones we create we can't change the size of an array during runtime.
 * 2-In array we can't perform CURD operations effectively.
 * 3-In array we can't store heterogeneous element. but we can over come this problem by using Object array concept.
 * 
 * */

	public static void main(String[] args) {
		Object[] object= {10,"Dipu",true,89.1,'K'};
		for (int i = 0; i < object.length; i++) {
			System.out.println(object[i]);
		}
	}
	/**
	 * 
	 * To over come the above draw back we should go concept called Collection Framework
	 * because it provides predefine data structure to store heterogeneous element.
	 * 
	 * */
}
