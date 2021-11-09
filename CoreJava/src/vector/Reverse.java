package vector;

import java.util.Vector;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();

		vt.add("Welcome");
		vt.add("To");
		vt.add("My");
		vt.add("World");
		vt.add("All");

		System.out.println("Before Reverse Order, Vector Contains : " + vt);

		// reverse() method to reverse vector element
		// by passing vector object so as to reverse
		Collections.reverse(vt);

		System.out.println("After Reverse Order, Vector Contains : " + vt);
	}
}
