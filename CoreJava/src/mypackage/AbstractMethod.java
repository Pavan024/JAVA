package mypackage;

abstract class Point {
	int x, y;

	public abstract String toString();

	protected String objString() {
		return super.toString();
	}
}

class ColoredPoint extends Point {
	int color;

	public String toString() {
		return objString() + ": color " + color; // correct
	}
}

public class AbstractMethod {

	public static void main(String[] args) {
		System.out.println(new ColoredPoint().toString());
	}

}
