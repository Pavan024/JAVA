package vector;

import java.util.Vector;

public class Add {
	public static void main(String args[]) {

		Vector<String> v = new Vector<String>();

		v.add("Geeks");
		v.add("for");
		v.add("Geeks");
		v.add("10");
		v.add("20");

		System.out.println("The vector is: " + v);

		// Adding new elements to the end
		v.add(2, "Last");
		v.add(4, "Element");

		System.out.println("The new Vector is: " + v);
	}
}
