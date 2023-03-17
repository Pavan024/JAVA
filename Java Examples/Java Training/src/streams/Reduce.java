package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Reduce {
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
		List<String> javaTpointStudents = Arrays.asList("aaa", "aa", "aa");
    // The reduce() method takes the lambda expression that take two string type values and returns a longer string  
       //The Optional data is returned as a result from the reduce() 
		// method because the list can be emplty on which reduce() method is called.
		Optional<String> newString = javaTpointStudents.stream()
				.reduce((firstName, secondName) -> firstName.length() > 
				secondName.length() ? firstName : secondName);
// show the result returned by the reduce method  
		newString.ifPresent(System.out::println);
//		System.out.println(mul);

	}
}
