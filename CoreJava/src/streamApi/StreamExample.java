package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(78);
		arr.add(20);
		arr.add(92);
		arr.add(50);
		arr.add(20);
		arr.add(79);
		arr.add(85);
		
		System.out.println("----------------------------------------------------------------");
		Optional<Integer> i = arr.stream().findAny();
		System.out.println(i);
		
		System.out.println("----------------------------------------------------------------");
		Optional<Integer> j = arr.stream().findFirst();
		System.out.println(j);
		
		System.out.println("----------------------------------------------------------------");
		long c = arr.stream().count();
		System.out.println(c);
		
		System.out.println("----------------------------------------------------------------");
		boolean b1 = arr.stream().anyMatch(n -> n == 30);
		System.out.println(b1);
		
		System.out.println("----------------------------------------------------------------");
		boolean b2 = arr.stream().allMatch(n -> n > 0);
		System.out.println(b2);
		
		System.out.println("----------------------------------------------------------------");
		List<Integer> list = arr.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("----------------------------------------------------------------");
		List<Integer> list1 = arr.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);
		
		System.out.println("----------------------------------------------------------------");
		arr.stream().forEach(a -> System.out.println(a));
		
		System.out.println("----------------------------------------------------------------");
		List<Integer> list2 = arr.stream().limit(5).collect(Collectors.toList());
		System.out.println(list2);
	}

}
