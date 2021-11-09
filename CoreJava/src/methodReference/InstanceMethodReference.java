package methodReference;

interface Messaging {
	void say();
}

public class InstanceMethodReference {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object
		// Referring non-static method using reference
		Messaging message = methodReference::saySomething;
		// Calling interface method
		message.say();
		// Referring non-static method using anonymous object
		Messaging message2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also
		// Calling interface method
		message2.say();
	}
}
