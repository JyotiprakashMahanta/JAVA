package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * 
 * 												VECTOR
 * 												======
 * 
 * It is concrete Implementing sub class of List Interface and it was introduced in jdk 1.0v.
 * It follows index based data structure to store Object.
 * 
 * Note:
 * -----
 * 
 * The classes which are introduced in jdk 1.0v those classes are know as legacy class.
 * 
 * All legacy class are synchronize class i.e single thread will execute at a time.
 * 
 * Characteristic Of Vector:
 * ------------------------
 * It store both homogeneous and heterogeneous Object.
 * 
 * It allow both duplicate and null object.
 * 
 * It provides index position to fetch object from collection.
 * 
 * It has default capacity 10 and incrementing capacity will be CurrentCapacity*2. i.e new Capacity=cc.*2;
 * 
 *  
 *  Method of Vector:
 *  ===================
 *  -> add(int index,Object o)
 *  ->addElement(Object o)
 *  ->capacity()
 *  ->elementAt(int index)
 *  ->indexOf(Object o)
 *  ->lastIndex(Object o)
 *  ->lastIndexOf(Object o)
 *  ->firstElement()
 *  ->lastElement()
*  ->trimToSize()
*  ->removeElement(Object o)
*  ->setElementAt(Object o,int index)
*  ->setSize(int size)
*  ->insertElementAt(Object o,int index)
*  ->elements()
*  ->    
 *  
 * 
 * 				-:Ways to collection object from vector:-
 * i)for each loop
 * ii)get()
 * iii)Iterator
 * iv)ListIterator
 * v)Enumeration
 * vi)elementAt()
 * 
 * 
 * 
 * 						-:Constructor of Vector:-
 * 
 * There are 4 types of vector constructor available in vector class.
 * 
 * 1-Vector():-It will create empty vector object with default capacity 10.
 * 2-Vector(intial Capacity):- It will create empty vector object with specified capacity.
 * 3-Vector(int intial Capacity,int increasing capacity):- It will create empty vector object with specified capacity and specified increasing capacity.
 * 4-Vector(Collection c):- It will create vector object with specified collection element and it size.
 * 
 * 
 * 
 * */
public class Vector_ {
	public static void main(String[] args) {
		Vector vector=new Vector();
		vector.add(10);
		vector.addElement(true);
		vector.add(1, false);
		vector.add("Dipu");
		vector.addElement("Himanshu");
		vector.add("Dipu");
		
//		1 way:-
//		for (Object object : vector) {
//			System.out.println(object);
//		}
		
//		2nd way:-
//		for (int i = 0; i < vector.size(); i++) {
//			System.out.println(vector.get(i));
//		}
		
//		3rd way:-
//		Iterator iterator=vector.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		4th way:-
//		ListIterator listIterator=vector.listIterator();
//		while (listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
//		System.out.println("---------------------------------------");
//		while (listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}
		
//		5th way:-
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.elementAt(i));
		}
		
		
//		6th way:-
		
//		Enumeration enumeration=vector.elements();
//		while (enumeration.hasMoreElements()) {
//			System.out.println(enumeration.nextElement());
//		}
		
		
//		vector.addAll(vector);
//		System.out.println(vector.elementAt(2));
//		System.out.println(vector.indexOf("Himanshu"));
//		System.out.println(vector.lastIndexOf(" "));
//		System.out.println(vector.firstElement());
//		System.out.println(vector.lastElement());
//		System.out.println(vector.capacity());
//		vector.trimToSize();
//		System.out.println(vector);
//		System.out.println(vector.remove(2));
//		System.out.println(vector.remove("Dipu"));
//		vector.set(0, 101);
//		vector.setElementAt("(((", vector.size()-1);
//		vector.setSize(101);
//		vector.insertElementAt(10.01, 55);
//		System.out.println(vector.indexOf(10.01));
//		System.out.println(vector);
//		System.out.println(vector.capacity());
	}
}
