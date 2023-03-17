package strings;

public class StringExample1 {

	public static void main(String[] args) {
		String str = "pavan"; //saves in constant pool no duplicate
		String str1 = new String("Pavan"); //saves in non constant pool allow duplicates
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println("-------------------------");
//		immutable
		String name = "Hello";
		System.out.println(name.hashCode());
		System.out.println(name);
		name = name + "wavelabs";
		System.out.println(name.hashCode());
		System.out.println(name);
		System.out.println("-------------------------");
//		mutable for both string buffer and string builder
		StringBuffer name1 = new StringBuffer("Hi");
		System.out.println(name1.hashCode());
		System.out.println(name1);
		name1.append("there");
		System.out.println(name1.hashCode());
		System.out.println(name1);
		
		System.out.println("-------------------------");
		String var1 = "pavan"; //saves in constant pool no duplicate
		String var2 = new String("pavan");
		String var3 = var1;
//		compares two string objects not values
		System.out.println(var1 == var2);
//		compares two string values
		System.out.println(var1.equals(var2));
//		compares two string objects not values
		System.out.println(var1 == var3 );
		
		System.out.println(var1.hashCode());
		System.out.println(var2.hashCode());
		System.out.println(var3.hashCode());
	}
}