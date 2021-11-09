package mypackage1;

class SuperClass {
	static String greeting() {
		return "Goodnight";
	}

	String name() {
		return "Richard";
	}
}

class SubClass extends SuperClass {
	static String greeting() {
		return "Hello";
	}

	String name() {
		return "Dick";
	}
}

class Test {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
		System.out.println(SuperClass.greeting() + ", " + s.name());
	}
}