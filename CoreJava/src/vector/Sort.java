package vector;

import java.util.Collections;
import java.util.Vector;

class Student implements Comparable<Student> {

	private int id;

	public Student(int id) {

		this.id = id;
	}

	public String toString() {
		return "Student[" + this.id + "]";
	}

	public int getId() {
		return this.id;
	}

	// Comparing the ids of two student
	// using the compareTo() method
	public int compareTo(Student otherStudent) {
		return this.getId() - otherStudent.getId();
	}
}

class Sort {

	public static void main(String[] args) {

		Vector<Student> student = new Vector<>();

		student.add(new Student(1));
		student.add(new Student(2));
		student.add(new Student(9));
		student.add(new Student(4));
		student.add(new Student(34));

		System.out.println("Before sorting:" + student);

		// Calling sort() method of collections
		Collections.sort(student);

		System.out.println("After sorting:" + student);
	}
}
