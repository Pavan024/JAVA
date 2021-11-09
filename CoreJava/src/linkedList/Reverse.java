package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Reverse {
	public static void main(String[] args) {
		LinkedList<Integer> linkedli = new LinkedList<Integer>();

		linkedli.add(1);
		linkedli.add(2);
		linkedli.add(3);
		linkedli.add(4);
		linkedli.add(5);
		System.out.print("Elements before reversing: " + linkedli);

		// Collections.reverse method takes a list as a
		// parameter and returns the reversed list
		Collections.reverse(linkedli);

		System.out.print("\nElements after reversing: " + linkedli);
	}
}
