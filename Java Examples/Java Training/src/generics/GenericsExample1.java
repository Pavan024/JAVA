package generics;

import java.util.Iterator;
import java.util.LinkedList;

class GenericExample1 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Name");
		list.add("Name1");
		// list.add(32);//compile time error
		System.out.println("element is: " + list.get(1));
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}