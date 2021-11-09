package linkedHashSet;

import java.util.LinkedHashSet;

public class Add {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(5);
		lhs.add(3);
		lhs.add(9);
		lhs.add(1);
		lhs.add(7);
		lhs.add(2);
		lhs.add(6);
		System.out.println(lhs);
		for (Integer i : lhs) {
			System.out.println(i);
		}
	}
}
