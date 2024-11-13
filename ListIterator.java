package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * List Iterator
 * --------------
 * 
 * ->It is an Interface which is used to iterated collection object in both forward and backward iteration
 * ->It consist set of abstract method which help the developer iterated the object.
 * ->We can use list iterator only in list and there sub classes because the helper method list iterator 
 * present in list.
 * 
 * Method of List Iterator:
 * ------------------------
 * i)hasNext()
 * ii)next()
 * iii)remove()
 * iv)hasPrevious()
 * v)previous()
 * vi)add(Object o)
 * vii)nextIndex()
 * viii)previousIndex()
 * ix)set(Object o)
 * 
 * 
 * */
public class ListIterator {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Dipu");
		list.add(10);
		list.add(true);
		list.add(788.2);
		Iterator iterator1=list.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("_______________________________________________");
		java.util.ListIterator iterator=list.listIterator(list.size());
		
//		iterator.hasPrevious();
//		System.out.println(iterator.previous());
//		iterator.hasPrevious();
//		System.out.println(iterator.previous());
		
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}	
	}
}
