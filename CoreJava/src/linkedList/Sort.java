package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Sort {
	public static void main(String args[]) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Bye");
		list.add("Hello");
		list.add("Hi");
		list.add("10");
		list.add("20");
		System.out.println("Before sorting:" + list);
		Collections.sort(list);
		System.out.println("After sorting:" + list);
	}
}