package methodReference;

interface Messageable {
	Message getMessage(String msg, String msg1);
}

class Message {
	Message(String msg, String msg1) {
		System.out.print(msg + msg1);
	}
}

public class ConstructorReference {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello", "World");
	}
}