package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

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
List<String> ss=Arrays.asList("opjiubk");
		list.stream().filter(e -> e.getMarks() > 50000).map(x -> x.getMarks() * 10).forEach(System.out::println);

		String collect = list.stream().filter(x -> {
			if (!x.getName().contains("amazon") && !x.getName().contains("digital")) {
				return true;
			}
			return false;
		}).map(map -> map.getName()).collect(Collectors.joining(","));
		System.out.println(collect);
		
		
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "linode.com");
	    map.put(2, "heroku.com");
		
		//Map -> Stream -> Filter -> String
		String result = map.entrySet().stream()
			.filter(x -> !"linode.com".equals(x.getValue()))
			.map(x->x.getValue())
			.collect(Collectors.joining());
		System.out.println(result);
	}
}
