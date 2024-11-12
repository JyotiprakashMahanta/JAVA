package Iterator;
/**
 * 
 * It is an Interface which consist abstract method which help the developer to iterator collection 
 * object in forward direction.
 * 
 * We can use iterator entire collection framework.
 * 
 * Method used in Iterator||
 * 1)hashNext()
 * 2)next()
 * 3)remove()
 * 
 * */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_ {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(10);
		list.add("Dipu");
		list.add(true);
		
		System.out.println(list);
		
		Iterator iterator=list.iterator();
//		iterator.re
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------------");
	}
}
