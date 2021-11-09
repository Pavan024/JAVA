package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Sort {

	public static void main(String[] args) {
//	    TreeSet<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());
//		ts.add(5);
//		ts.add(3);
//		ts.add(9);
//		ts.add(1);
//		ts.add(7);
//		ts.add(2);
//		ts.add(6);
//		System.out.println(ts);
//				or	
		Comparator<Integer> cmp = new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
		};
		TreeSet<Integer> ts = new TreeSet<Integer>(cmp);
		ts.add(5);
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(7);
		ts.add(2);
		ts.add(6);
		System.out.println("Descending order: " + ts);
	}

}