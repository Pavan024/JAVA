package methodReference;

interface MethodReference {
	public void method(String name, String message);
}

public class Example {
	public static void textMessage(String name, String message) {
		System.out.println(name + message);
	}

	public static void main(String[] args) {
		MethodReference exmp = Example::textMessage;
		exmp.method("pavan ", "how are you ?");
	}

}
