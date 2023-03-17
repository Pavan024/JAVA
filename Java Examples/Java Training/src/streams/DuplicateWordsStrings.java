package streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordsStrings {

	public static void main(String[] args) {
		
		String orignalString = "Anjali Anjali";
		String output = Arrays.asList(orignalString.split(""))
								.stream()
								.distinct()
								.collect(Collectors.joining());

		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + output);
	}

}
