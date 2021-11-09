package treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Sort {

	public static void main(String[] args) {
		Comparator<Integer> cmp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}

		};
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(cmp);

		tm.put(3, "Hi");
		tm.put(2, "Good");
		tm.put(1, "Morning");
		System.out.println(tm);
	}

}
