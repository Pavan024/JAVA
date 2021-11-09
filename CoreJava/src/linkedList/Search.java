package linkedList;

import java.util.LinkedList;

public class Search {
	public static void main(String args[]) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Bye");
		list.add("Hello");
		list.add("Hi");
		list.add("10");
		list.add("20");

		System.out.println("LinkedList:" + list);

		System.out.println("\nDoes the List contains 'Hello': " + list.contains("Hello"));

		System.out.println("Does the List contains '20': " + list.contains("20"));

		System.out.println("Does the List contains 'Pavan': " + list.contains("Pavan"));

	}
}
