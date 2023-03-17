package streams;

import java.util.ArrayList;

public class Lambda {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		// a.forEach(aa->System.out.println(a));

		a1.forEach(aa -> {
			if (aa % 2 == 0) {
				System.out.println(aa);
			}
		});

		a1.forEach(a2 -> System.out.println(a2 + a2));

		Add add = (a,b) -> a + b;

		System.out.println("sum of numbers " + add.method(2, 3));

	}

	interface Add {
		int method(int a, int b);
	}

	

}
