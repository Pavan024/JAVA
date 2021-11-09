package hashSet;

import java.util.HashSet;

public class Search {
	public static void main(String args[]) {

		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(5);
		hs1.add(2);
		hs1.add(3);
		hs1.add(6);
		hs1.add(null);

		System.out.println("HashSet 1: " + hs1);

		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(5);
		hs2.add(2);
		hs2.add(3);
		hs2.add(6);
		hs2.add(null);

		System.out.println("HashSet 2: " + hs2);

		// Check if the set
		// contains same elements
		System.out.println("\nDoes set 1 contains set 2: " + hs1.containsAll(hs2));
	}
}
