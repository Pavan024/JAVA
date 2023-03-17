package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ToArrays {
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

		Student[] ss = list.stream().filter(i -> i.getMarks() >= 50000.0)
				.toArray(Student[]::new);
		System.out.println(Arrays.toString(ss));

		Student[] array = list.stream().toArray(Student[]::new);
		System.out.println(Arrays.toString(array));
		// Converting an Infinite Stream to an Array

		IntStream infiniteNumberStream = IntStream.iterate(1, i -> i + 1);

		int[] intArray = infiniteNumberStream.limit(10).toArray();

		System.out.println(Arrays.toString(intArray));

	}
}
