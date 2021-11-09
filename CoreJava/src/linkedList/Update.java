package linkedList;

import java.util.LinkedList;

public class Update {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Bye");
		list.add("Hello");
		list.add("Hi");
		list.add("10");
		list.add("20");

		System.out.println("LinkedList:" + list);

		// Using set() method to replace Hi with Pavan
		System.out.println("\nThe Object that is replaced is: " + list.set(2, "Pavan"));

		// Using set() method to replace 20 with 50
		System.out.println("The Object that is replaced is: " + list.set(4, "50"));

		System.out.println("The new LinkedList is:" + list);
	}
}
