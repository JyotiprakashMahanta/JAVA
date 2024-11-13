package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * ITERATOR
 * ----------
 * ->It is an Interface which consist abstract method.
 * which help the developer to iterator collection object in forward direction.
 * 
 * -> We can use Iterator entire collection framework.
 * 
 * Method of Iterator
 * -----------------
 * i)hashNext()->return boolean value.
 * ->it is used whether element present or not .if element present it returns true else return false.
 * 
 * ii)next()->return Object
 * ->it is used to return/fetch the object from the collection and also it move the cursor to next position,
 * if object is not there in the index position then it throw nosuchElementException.
 * 
 * iii)remove()->return type void 
 * 
 * ->it is used to remove the last object from the collection.
 * 
 * */
public class Iterator$ {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(10);
		list.add("jyoti");
		list.add(true);
		
		Iterator iterator=list.iterator();
//		Manual tracing
//		iterator.hasNext();
//		System.out.println(iterator.next());
//		iterator.hasNext();
//		System.out.println(iterator.next());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
