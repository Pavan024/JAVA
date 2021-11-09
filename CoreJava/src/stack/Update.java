package stack;

import java.util.Stack;

public class Update {
	public static void main(String args[]) {

		Stack<String> stack = new Stack<String>();

		// Use add() method to add elements in the stack
		stack.add("Welcome");
		stack.add("Hi");
		stack.add("Hello");
		stack.add("10");
		stack.add("20");

		System.out.println("Stack:" + stack);

		// Using setElementAt() method to replace Geeks with GFG
		stack.setElementAt("Morning", 2);

		System.out.println("The new Stack is:" + stack);
	}
}
