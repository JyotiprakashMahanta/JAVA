package LinkedList;

import java.util.Iterator;

/**
 * 
 * 					-:Linked List/CircularLinked List/DoblyLinked List:-
 * 					=====================================================
 * 
 * It is concrete implementing sub class of List Interface 
 * It follows noodle data structure.
 * 
 *  Characteristic of linked list:
 *  ------------------------------
 *  
 *  It store the object in form of node.
 *  It store both homogeneous and heterogeneous object.
 *  It store even duplicate and null object.
 *  It maintain order of insertion.
 *  There is no default capacity in linked list.
 *  
 *  note:
 *  -----
 *  When we want to perform insertion and deletion operation effectively we should 
 *  use linked list.
 *  
 *   Every object consist previous node address and next node address so it is also know 
 *   DoblyLinked list.
 *   
 *   Method of Linked List:-
 *   -------------------------
 *   ->addFirst()
 *   ->addLast()
 *   ->removeFirst()
 *   ->removeLast()
 *   ->removeFirstOccurance(Object o)
 *   ->removeLastOccurance(Object o)
 *   
 *   
 *   Constructor of Linked List:
 *   =============================
 *   
 *   There are only two constructor available in Linked list.
 *   1-LinkedList()
 *   2-LinkedList(Collection c)
 *   
 *    
 *    
 * 
 * */
public class LinkedList {
	public static void main(String[] args) {
		java.util.LinkedList list=new java.util.LinkedList();
		list.add(10);
		list.add("Dipu");
		list.add("JiJyoti");
		list.add(true);
		list.addFirst(null);
		list.addLast("Last");
		list.removeFirst();
		list.removeLast();
		list.add(10);
		list.add(10);
		list.removeLastOccurrence(10);
		list.removeFirstOccurrence(10);
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println(list);
		Iterator iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
