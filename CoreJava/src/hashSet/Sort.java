package hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Sort {
	public static void main(String args[]) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(90);
		hs.add(2);
		hs.add(3);
		hs.add(60);
		System.out.println("Original HashSet: " + hs);

		// Sorting HashSet using List
		List<Integer> list = new ArrayList<Integer>(hs);
		Collections.sort(list);
		System.out.println("HashSet elements in sorted order using List: " + list);

		TreeSet<Integer> treeSet = new TreeSet<Integer>(hs);
		System.out.println("HashSet elements in sorted order using TreeSet: " + treeSet);

	}
}
