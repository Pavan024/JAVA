package mypackage1;

final class Point {
	int x, y;

	void move(int dx, int dy) {
		x += dx;
		y += dy;
		System.out.println(x);
		System.out.println(y);
	}
}

public class FinalMethod {
	public static void main(String[] args) {
		Point[] p = new Point[100];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Point();
			p[i].move(i, p.length - 1 - i);
		}
	}
}