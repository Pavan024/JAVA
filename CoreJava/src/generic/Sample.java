package generic;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0);// typecasting
		System.out.println(s);
//		After Generics, we don't need to typecast the object.  
		List<String> list1 = new ArrayList<String>();
		list1.add("hello");
		String s1 = list1.get(0);
		System.out.println(s1);
	}

}
