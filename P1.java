
/**
 * 
 * 1-It is combination of group of Interfaces,group of abstract classes and
 * group of concrete Implementing sub classes and there method.
 * 
 * 2-Collection Framework help the developer to perform object manipulation i.e CURD Operations.
 * 
 * 3-In collection framework every things we are going to represent in the form of Object. 
 * i.e Non primitive data type.
 * 
 * 4- In collection framework there are 2 hierarchy i)Collection hierarchy ii) Map hierarchy
 * 
 * 
*								  Collection
*								 ----------
*It is a main interface of collection framework and it consist set of abstract method 
*to perform Object manipulation.
*
*			Method of Collection
*1-add(Object o)
*2-addAll(Collection c)
*3-remove(Object o)
*4-removeAll(Collection c)
*5-clear()
*6-retainAll(Object c)
*7-size()
*8-contains(Object e)
*9-containsAll(Collection c)
*10-isEmpty()
*11-iterator()
*12-equals(Object o)
*
*					List(Interface)
*					--------------
*It is a sub interface of collection interface which consist collection of abstract method 
*and its own abstract method.
*
*	Character of List
*	-------------------
*It provides index position to store the object it store both homogeneous and heterogeneous Object.
*It maintain order of insertion
*It accept even duplicate and null object
*
*				ArrayList(Concrete Implementing Sub Class)
*				------------------------------------------
*It is CISC of List Interface and it gives implementing sub class of List interface and its 
*implementing for all the abstract member of list and collection interface.
*
*It follow array data structure who's size is growable in nature.
*
*						Characteristics Of ArrayList
*						------------------------------
*It follow all characteristics of list it has default capacity 10 and increase capacity
* will be new capacity 
* 
* The default capacity of array list is 10.
* if the value increase into size 10 the the formula of new array size is current capacity*3+1/2 followed. 
*
* 
 * */

package Class_work;

import java.util.ArrayList;

public class P1 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("10");
		list.add(10);
		list.add(true);
		list.add('X');
		list.add(null);
		System.out.println(list);
		int size=list.size();
		System.out.println(size);
		ArrayList list2=new ArrayList();
		list2.addAll(list);
		list2.add(false);
		System.out.println(list2.remove(null));
		System.out.println(list2);
	}
}









