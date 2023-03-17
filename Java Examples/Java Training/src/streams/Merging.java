package streams;

import java.util.HashMap;
import java.util.Map;

public class Merging {
	public static void main(String[] args) {
		Map<String, Integer> s = new HashMap<>();
		s.put("anjali", 1);
		s.put("anu", 2);
		s.merge("anju", 3, (o, n) -> o + n);
		System.out.println(s);
	}
}
