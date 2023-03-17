package record;

record Employee(int id, String firstName, String lastName) {

// Instance fields need to be present in the record's
// parameters but record can define static fields.
	static int empToken;

// Constructor 1 of this class
// Compact Constructor
	public Employee {
		if (id < 100) {
			throw new IllegalArgumentException("Employee Id cannot be below 100.");
		}
		if (firstName.length() < 2) {
			throw new IllegalArgumentException("First name must be 2 characters or more.");
		}
	}

// Constructor 2 of this class
// Alternative Constructor
	public Employee(int id, String firstName) {
		this(id, firstName, null);
	}

	public void getFullName() {
		if (lastName == null)
			System.out.println(firstName());

		else
			System.out.println(firstName() + " " + lastName());
	}

	public static int generateEmployeeToken() {
		return ++empToken;
	}
}

class Mainclass {

	public static void main(String args[]) {

		Employee e1 = new Employee(1001, "saipavan", "kumar");

		System.out.println(e1.id() + " " + e1.firstName() + " " + e1.lastName());

		System.out.println(e1.toString());

		Employee e2 = new Employee(1002, "manisai");

		e2.getFullName();

		System.out.println("Employee " + e2.id() + " Token = " + Employee.generateEmployeeToken());

		System.out.print("Is e1 equal to e2: " + e1.equals(e2));
	}
}
