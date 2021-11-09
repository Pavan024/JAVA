package lambdaExpressions;

interface Greeting {
	public String say(String name);
}

public class LambdaExpressionExample2 {
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Greeting g1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(g1.say("Pavan"));

		// You can omit function parentheses
		Greeting g2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(g2.say("Pavan"));
	}
}