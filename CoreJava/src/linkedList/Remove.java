package linkedList;

import java.util.LinkedList;

public class Remove {
	public static void main(String args[]) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Bye");
		list.add("Hello");
		list.add("Hi");
		list.add("10");
		list.add("20");

		System.out.println("Original LinkedList:" + list);

		list.clear();

		System.out.println("List after clearing all elements: " + list);

		list.add("Bye");
		list.add("Hello");
		list.add("Hi");
		// Retrieves and removes the head (first element) of this list
		list.remove();
		// Removes the element at the specified position in this list.
		// Shifts anysubsequent elements to the left (subtracts one from their indices).
		// Returns the element that was removed from the list
		list.remove(0);
		list.remove("Hi");

		System.out.println("After adding elements to empty list:" + list);
	}
}
