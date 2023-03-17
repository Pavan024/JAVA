package strings;

public class StringExample2 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "HELLO";
//		compareTo methods unicode values of each character and 
//		returns +ve value if str1 > str2 returns -ve id str1 < str2 0 if str1 == str2
		System.out.println(str1.compareTo(str2)); //
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareToIgnoreCase(str2));
		String str3 = str1;
		System.out.println(str1.compareTo(str3));
		
		System.out.println("----------------------");
		
		
		String var1 = "1233456";
		String var2 = var1;
		System.out.println(var2 == var1);
//advantage of immutable feature: changes done from one reference variable will not affect another reference variable 
		var2 = "hello world";
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var1 == var2);
		
		String str="gh 5454##^%$^%ster fj";
		str = str.replaceAll("[^0-9]", "");
		System.out.println("Numbers :-"+str);
		
		String var = "pavan";
		System.out.println(var.hashCode());
//disadvantage of immutable feature: if we change value of string for n times it will create n objects leads to out of memory
		var = "hello world";
		System.out.println(var.hashCode());
	}

}
