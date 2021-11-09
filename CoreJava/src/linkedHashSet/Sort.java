package linkedHashSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sort {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		set.add(10);
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(30);

		System.out.println("Before sort: " + set);

//		// Convert LinkedHashSet to an ArrayList
//		ArrayList<Integer> array = new ArrayList<>(set);
//
//		// sort ArrayList
//		Collections.sort(array);
//		        or
		TreeSet<Integer> t = new TreeSet<Integer>(set);

		System.out.println("After sort: " + t);
	}
}
