package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		String ssss = "Anjali";
		String collectss = Stream.of(ssss).map(word -> new StringBuilder().reverse()).collect(Collectors.joining(" "));
		System.out.println(collectss);
	}
}
