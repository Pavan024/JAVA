package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLtterIntoUpperCase {
	public static void main(String[] args)

	{
		String str = "how are OHUYASUSVAUGBFYou";
		String result = captalize(str);
		System.out.println("Output => " + result);
	}

	public static String captalize(String string) {
		if (string == null) {
			return "empty";
		}

		return Arrays.stream(string.split("\\s+")).map(e -> e.substring(0, 1)

				.toUpperCase() + e.substring(1).toLowerCase()).collect(Collectors.joining(" "));

	}

}
