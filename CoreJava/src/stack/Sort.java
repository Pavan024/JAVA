package stack;

import java.util.Collections;
import java.util.Stack;

public class Sort {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		// Use add() method to add elements in the stack
		stack.add("Welcome");
		stack.add("Hi");
		stack.add("Hello");
		stack.add("10");
		stack.add("20");
		System.out.println("Before Sorting:" + stack);
		Collections.sort(stack);
		System.out.println("After Sorting:" + stack);
	}
}
