package mypackage1;

//Java program to demonstrate that we can have
//different return types if return type in
//overridden method is sub-type

//Two classes used for return types.
class A {
}

class B extends A {
}

class Base1 {
	A fun() {
		System.out.println("Base fun()");
		return new A();
	}
}

class Derived extends Base1 {
	B fun() {
		System.out.println("Derived fun()");
		return new B();
	}
}

public class Main3 {
	public static void main(String args[]) {
		Base1 base = new Base1();
		base.fun();

		Derived derived = new Derived();
		derived.fun();
	}
}
