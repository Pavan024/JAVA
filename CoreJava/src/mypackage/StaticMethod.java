package mypackage;

public class StaticMethod {
	static int num;

	public static void testMethod() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		testMethod();// correct way of invoking static method
//		super.testMethod();// Cannot use super in a static context
//		this.testMethod();// Cannot use this in a static context
	}

}
