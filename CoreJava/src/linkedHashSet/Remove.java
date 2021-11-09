package linkedHashSet;

import java.util.LinkedHashSet;

public class Remove {
	public static void main(String args[]) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		// Use add() method to add elements into the Set
		set.add("Welcome");
		set.add("To");
		set.add("core");
		set.add("java");
		set.add("training");

		System.out.println("LinkedHashSet: " + set);

		// Removing elements using remove() method
		set.remove("training");
		set.remove("To");
		set.remove("Welcome");

		System.out.println("LinkedHashSet after removing " + "elements: " + set);
	}
}
