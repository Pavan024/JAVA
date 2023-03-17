package generics;

public class GenericsExample5 {
	private double val;

	// Generic constructor
	<T extends Number> GenericsExample5(T arg) {
		val = arg.doubleValue();
	}

	public void showVal() {
		System.out.println("Value is : " + val);
	}

	public static void main(String[] args) {
		GenericsExample5 obj = new GenericsExample5(100);
		GenericsExample5 onj1 = new GenericsExample5(200l);
		obj.showVal();
		onj1.showVal();
	}
}