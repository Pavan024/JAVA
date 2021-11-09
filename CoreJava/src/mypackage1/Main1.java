package mypackage1;

class Base {
	// private methods are not overridden
	private void m1() {
		System.out.println("From parent m1()");
	}

	protected void m2() {
		System.out.println("From parent m2()");
	}
}

class Sub extends Base {
	// new m1() method
	// unique to Child class
	private void m1() {
		System.out.println("From child m1()");
	}

	// overriding method
	// with more accessibility

	@Override
	public void m2() {
		System.out.println("From child m2()");
	}
}

// Driver class
class Main1 {
	public static void main(String[] args) {
		Base obj1 = new Base();
		obj1.m2();
		Base obj2 = new Sub();
		obj2.m2();
	}
}
