package hashSet;

import java.util.HashSet;
import java.util.Iterator;

class Add {
	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(2);
		hs.add(3);
		hs.add(6);
		hs.add(null);

		// print HashSet elements one by one.
		// Insertion order in not preserved and it is based
		// on hash code of objects.

		Iterator<Integer> itr = hs.iterator();

		// check element is present or not. if not loop will
		// break.
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(hs);
	}
}
