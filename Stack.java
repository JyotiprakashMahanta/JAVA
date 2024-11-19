package Stack;

import java.util.List;

/**
 * 
 * 								Stack
 * 								=====
 * 
 * It is sub class of vector class and it was also introduced by JDK 1.0v.
 * It follow stack data structure i.e FIFO. (First In First Out)
 * 
 * 					-:Characteristic of Stack:-
 * Store both homogeneous , heterogeneous Object and (duplicate null)
 * default capacity 10. next increasing capacity is (Current Capacity*2)
 * give indexOf() to extract Object.
 * 
 * 				-:Method of Stack:-
 * 
 * -> push(Object o)
 * -> pop()
 * -> peek()
 * -> search(Object o)
 * -> empty()
 * 
 * 
 * */
public class Stack {
	public static void main(String[] args) {
		java.util.Stack list=new java.util.Stack();
		list.add(10);
		list.add("Dipu");
		list.add(false);
		list.push("Goura");
		list.push("Himanshu");
		list.push(1.1);
//		System.out.println(list.pop());
//		System.out.println(list.peek());
		System.out.println(list.search(10));
		System.out.println(list.search(1.0));
		System.out.println(list.empty());
		System.out.println(list);
		
	}
}
