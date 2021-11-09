package treeSet;

import java.util.TreeSet;

public class Remove {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(7);
		ts.add(2);
		ts.add(6);
		System.out.println("Before Removing: " + ts);
		ts.remove(1);
		ts.remove(3);
		System.out.println("After Removing: " + ts);
	}
}
