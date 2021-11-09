package lambdaExpressions;

interface Operation {
	int opt(int a, int b);
}

public class LambdaExpressionExample4 {
	public static void main(String[] args) {

		// Lambda expression without return keyword.
		Operation add = (a, b) -> (a + b);
		System.out.println(add.opt(10, 20));

		// Lambda expression with return keyword.
		Operation multiply = (int a, int b) -> {
			return (a * b);
		};
		System.out.println(multiply.opt(10, 20));
	}
}