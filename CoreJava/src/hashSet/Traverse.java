package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Traverse {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(2);
		hs.add(3);
		hs.add(6);
		hs.add(null);

		// Iterating over hash set items
		System.out.println("Traversing by iterator");
		Iterator<Integer> i = hs.iterator();
		while (i.hasNext())
			System.out.println(i.next());

		System.out.println("Traversing by for each loop");
		for (Integer j : hs)
			System.out.println(j);

		System.out.println("Traversing by for each method");
		hs.forEach(k -> System.out.println(k));
	}
}
