package linkedHashSet;

import java.util.LinkedHashSet;

public class Search {

	public static void main(String[] args) {

		LinkedHashSet<String> lhSetColors = new LinkedHashSet<String>();

		lhSetColors.add("red");
		lhSetColors.add("green");
		lhSetColors.add("blue");
		
		// this will return true as the "red" element exists
		System.out.println(lhSetColors.contains("red"));

		// this will return false as the "white" element does
		// not exists
		System.out.println(lhSetColors.contains("white"));
	}
}
