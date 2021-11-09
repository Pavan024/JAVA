package streamApi;

import java.util.ArrayList;

class Student {
	long studId;
	String studName;
	int marks;

	public Student(long studId, String studName, int marks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", marks=" + marks + "]";
	}

}

public class StreamExample3 {

	public static void main(String[] args) {

		Student e1 = new Student(1l, "venkatesh", 1500);
		Student e2 = new Student(2l, "rajesh", 1400);
		Student e3 = new Student(3l, "ramesh", 2000);
		Student e4 = new Student(4l, "sravan", 500);
		Student e5 = new Student(5l, "uday", 3500);
		Student e6 = new Student(6l, "srinu", 1900);
		ArrayList<Student> student = new ArrayList<Student>();

		student.add(e1);
		student.add(e2);
		student.add(e3);
		student.add(e4);
		student.add(e5);
		student.add(e6);
		
		student.stream().filter(s->s.marks>1400).forEach(stud->System.out.println(stud.studId));

	}
}