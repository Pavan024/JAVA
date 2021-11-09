package lambdaExpressions;

interface Sayable {
	public String say();
}

public class LambdaExpressionExample1 {
	public static void main(String[] args) {
		Sayable s = () -> {
			return "Hi Team, Good Morning.";
		};
		System.out.println(s.say());
	}
}