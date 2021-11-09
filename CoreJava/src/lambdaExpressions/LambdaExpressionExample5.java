package lambdaExpressions;

@FunctionalInterface
interface Advice {
	String say(String message);
}

public class LambdaExpressionExample5 {
	public static void main(String[] args) {

		// You can pass multiple statements in lambda expression
		Advice person = (message) -> {
			String str1 = "I would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.say("time is precious."));
	}
}