package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorExample {
	public static void main(String[] args) {
		Student s = new Student(534, "Anjali", 30000);
		Student s1 = new Student(531, "Neha", 50000);
		Student s2 = new Student(513, "Lalitha", 60000);
		Student s3 = new Student(531, "Nirosha", 80000);
		Student s5 = new Student(510, "Preethi", 50000);
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s5);

		Comparator<Student> students = (std1, std2) -> std1.getName().compareTo(std2.getName());
		List<Student> collect = list.stream().sorted(students).collect(Collectors.toList());
		collect.stream().forEach(e -> System.out.println(e));

		Comparator<Student> comDoubleString = Comparator.comparingDouble(Student::getMarks);
		List<Student> collect2 = list.stream().sorted(comDoubleString).collect(Collectors.toList());
		collect2.stream().forEach(e -> System.out.println("double" + e));

		List<Student> collect3 = list.stream().sorted(students.thenComparing(comDoubleString))
				.collect(Collectors.toList());
		collect3.stream().forEach(e -> System.out.println(e));
//Descending Order 
		Comparator<Student> employeeNameComparator = Comparator.comparing(Student::getName, (e1, e2) -> {
			return e2.compareTo(e1);
		});
		List<Student> collects = list.stream().sorted(employeeNameComparator).collect(Collectors.toList());
		collects.stream().forEach(e -> System.out.println("ljk" + e));

		

	}

}
