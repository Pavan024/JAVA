package generic;

import java.util.Comparator;
import java.util.TreeSet;

class Student<T> {
	T sId;
	T sName;

	public Student(T sId, T sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}

}

class IdComp<T> implements Comparator<Student<T>> {

	@Override
	public int compare(Student<T> s1, Student<T> s2) {
		return ((String) s1.sId).compareTo((String) s2.sId);
	}

}

public class Collage {
	public static void main(String[] args) {
		TreeSet<Student<String>> ts = new TreeSet<Student<String>>(new IdComp<String>());

		ts.add(new Student<String>("1", "Pavan"));

		ts.add(new Student<String>("2", "Sai"));

		ts.add(new Student<String>("3", "Kumar"));

		ts.add(new Student<String>("4", "Venkat"));
		for (Student<String> s : ts) {
			System.out.println(s);
		}
	}

}