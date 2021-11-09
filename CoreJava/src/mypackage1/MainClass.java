//An inner class is a nested class that is not explicitly or implicitly declared static
package mypackage1;

class MyClass {
	static String str = " ";

	protected MyClass() {
		str += "abc ";
	}

}

class DerivedClass extends MyClass {
	private DerivedClass() {
		str += "sub ";
	}
}

public class MainClass extends MyClass {
	private MainClass() {
		str += "subsub ";
	}

	public static void main(String[] args) {
		new MainClass();
		System.out.println(str);
	}

}