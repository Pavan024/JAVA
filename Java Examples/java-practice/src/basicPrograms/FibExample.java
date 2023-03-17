package basicPrograms;

public class FibExample {
	public static void main(String[] args) {
		int n = 10, a = 0, b = 0, c = 1;
		System.out.println("Fibanocci Series..");
		for (int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + "");
		}

	}
}
