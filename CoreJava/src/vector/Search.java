package vector;

import java.util.Vector;

public class Search {

	public static void main(String args[]) {
		Vector<String> vt = new Vector<String>();

		vt.add("Welcome");
		vt.add("To");
		vt.add("My");
		vt.add("World");
		vt.add("All");

		// Searching The Index Of Element
		System.out.println("The index of element world in Vector is: " + vt.indexOf("World"));
		System.out.println("The index of element my in Vector is: " + vt.indexOf("My"));
	}
}
