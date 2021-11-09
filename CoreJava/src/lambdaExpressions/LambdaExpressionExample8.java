package lambdaExpressions;

import java.util.function.Consumer;

public class LambdaExpressionExample8 {

	public int x = 0;

	class FirstLevel {

		public int x = 1;

		void methodInFirstLevel(int x) {

			int z = 2;

			Consumer<Integer> myConsumer = (y) -> {
				// The following statement causes the compiler to generate
				// the error "Local variable z defined in an enclosing scope
				// must be final or effectively final"
				// z = 99;
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("z = " + z);
				System.out.println("this.x = " + this.x);
				System.out.println("LambdaScopeTest.this.x = " + LambdaExpressionExample8.this.x);
			};

			myConsumer.accept(x);

		}
	}

	public static void main(String... args) {
		LambdaExpressionExample8 st = new LambdaExpressionExample8();
		LambdaExpressionExample8.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}