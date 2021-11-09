package enumeration;

public enum Calculator {
	PLUS {
		double eval(double x, double y) {
			return x + y;
		}
	},
	MINUS {
		double eval(double x, double y) {
			return x - y;
		}
	},
	TIMES {
		double eval(double x, double y) {
			return x * y;
		}
	},
	DIVIDED_BY {
		double eval(double x, double y) {
			return x / y;
		}
	};

// Each constant supports an arithmetic operation
	abstract double eval(double x, double y);

	public static void main(String args[]) {

		for (Calculator cal : Calculator.values())
			System.out.println(cal.eval(5, 5));
	}
}