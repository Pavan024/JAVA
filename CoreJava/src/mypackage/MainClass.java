//An inner class is a nested class that is not explicitly or implicitly declared static.
package mypackage;

class Outer {
	int x = 10;

	public void displayX() {
		System.out.println(x);
	}

	public  static class Inner {//nested class but not inner class
		static int y = 20;//static variables which are not constant

		public static void displayY() {//static method
			System.out.println(y);
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.displayX();
		Outer.Inner.displayY();
	}

}
