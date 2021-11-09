package stack;

import java.util.Stack;

public class Add {
	public static void main(String args[]) {
		Stack<String> STACK = new Stack<String>();

		// Use push() to add elements into the Stack
		STACK.push("Welcome");
		STACK.push("To");
		STACK.push("core");
		STACK.push("Java");
		STACK.push("Training");

		System.out.println("Initial Stack: " + STACK);

		STACK.push("Hello");
		STACK.push("World");

		System.out.println("Final Stack: " + STACK);
	}
}