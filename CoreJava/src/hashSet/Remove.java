package hashSet;

import java.util.HashSet;

public class Remove {
	public static void main(String[] argv) throws Exception {

		try {

			HashSet<Integer> hs1 = new HashSet<Integer>();

			hs1.add(1);
			hs1.add(2);
			hs1.add(3);
			hs1.add(4);
			hs1.add(5);

			System.out.println("HashSet before " + "removeAll() operation : " + hs1);

			HashSet<Integer> hs2 = new HashSet<Integer>();
			hs2.add(1);
			hs2.add(2);
			hs2.add(3);

			System.out.println("Collection Elements" + " to be removed : " + hs2);

			// Removing elements from arrset
			// specified in hs2
			// using removeAll() method
			hs1.removeAll(hs2);

			System.out.println("HashSet after " + "removeAll() operation : " + hs1);
		}

		catch (NullPointerException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
