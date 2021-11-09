package mypackage;

class AnonymousInner {
	public void showMessage() {
		System.out.println("Hi");
	}
}

class Outer1 {
	int x = 10;

	public void displayX() {
		System.out.println(x);
		class Inner2 { // local class
			int z = 30;

			public void displayZ() {
				System.out.println(z);
			}
		}
		Inner2 in = new Inner2();
		in.displayZ();
	}

	class Inner1 { // A non-static Member class
		int y = 20;

		public void displayY() {
			System.out.println(y);
		}
	}
}

public class MainClass1 {

	public static void main(String[] args) {
		Outer1 obj = new Outer1();
		obj.displayX();
		Outer1.Inner1 obj1 = obj.new Inner1();
		obj1.displayY();
		AnonymousInner ai = new AnonymousInner() { // Anonymous Inner class
			public void showMessage() {
				System.out.println("Hello World");
			}
		};
		ai.showMessage();
	}

}
