package general;

public class Example1 {

	public static void main(String[] args) {
//		instanceof keyword
		String str = "Pavan";
		if (str instanceof String) {
			System.out.println("string class");  
		}
		else {
			System.out.println("not string class");
		}
//		Ternary operator
		String res = str.equals("Pavan") ? "equals" : "not equals";
		System.out.println(res);
	}

}
