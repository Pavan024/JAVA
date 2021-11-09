package enumeration;

public enum Months {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;

	static {
		System.out.println("static block of enumeration");
	}
	{
		System.out.println("Instance block of enumeration");
	}

	public static void method1() {
		System.out.println("static method of enumeration");
	}

	public void method2() {
		System.out.println("Instance method of enumeration");
	}

	public static void main(String... args) {
		for (Months mns : Months.values()) {
			mns.method2();
		}
		method1();
	}
}