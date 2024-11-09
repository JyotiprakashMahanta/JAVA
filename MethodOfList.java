package MethodList;

import java.util.ArrayList;

public class MethodOfList {
	public static void main(String[] args) {
		ArrayList  list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(null);
		list.add(false);
		
		list.add(0, true);
		list.add(list.size(), "----");
		list.addAll(list.size(), list);
		System.out.println(list);
		int i=0;
		System.out.println("\nby using for-each loop in arraylist ");
		for (Object o : list) {
			System.out.println(i+++"-"+o);
		}
		System.out.println("by using for loop in arraylist ");
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	}
}
