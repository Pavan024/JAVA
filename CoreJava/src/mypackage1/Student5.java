package mypackage1;

//Java program to initialize the values from one object to another object.   

class Student5 {
	int id;
	String name;

	// constructor to initialize integer and string
	Student5(int i, String n) {
		id = i;
		name = n;
	}

	// constructor to initialize another object
	Student5(Student5 s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student5 s1 = new Student5(111, "Karan");
		Student5 s2 = new Student5(s1);
		s1.display();
		s2.display();
	}
}