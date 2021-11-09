package mypackage1;

//A Java program to demonstrate that overridden
//method can be called from sub-class

//Base Class
class Parent1 {
	void show() {
		System.out.println("Parent's show()");
	}
}

//Inherited class
class Child1 extends Parent1 {
	// This method overrides show() of Parent
	@Override
	void show() {
		super.show();
		System.out.println("Child's show()");
	}
}

//Driver class
class Main4 {
	public static void main(String[] args) {
		Parent1 obj = new Child1();
		obj.show();
	}
}
