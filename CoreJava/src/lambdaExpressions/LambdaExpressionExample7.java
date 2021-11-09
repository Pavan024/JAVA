package lambdaExpressions;

interface Average {
	public int add(int a, int b, int c);

}

public class LambdaExpressionExample7 {
	public static void findavg(Average a) {
		int sum = a.add(2, 3, 4);
		int avg = sum / 3;
		System.out.println("Average is :" + avg);
	}

	public static void main(String[] args) {
		Average a1 = (int a, int b, int c) -> {
			return a + b + c;
		};
		//passing lambda expression as argument
		findavg(a1);

	}
}