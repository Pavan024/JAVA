package stack;

import java.util.Stack;

public class Remove {
	public static void main(String args[]) {
		Stack<Integer> STACK = new Stack<Integer>();

		STACK.push(10);
		STACK.push(15);
		STACK.push(30);
		STACK.push(20);
		STACK.push(5);

		System.out.println("Initial Stack: " + STACK);

		// Removing elements using pop() method
		System.out.println("Popped element: " + STACK.pop());
		System.out.println("Popped element: " + STACK.pop());

		System.out.println("Stack after pop operation " + STACK);
	}
}
