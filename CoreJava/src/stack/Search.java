package stack;

import java.util.Stack;

public class Search {
	public static void main(String[] args) {
		Stack<Integer> STACK = new Stack<Integer>();

		STACK.push(8);
		STACK.push(5);
		STACK.push(9);
		STACK.push(2);
		STACK.push(4);

		System.out.println("The stack is: " + STACK);

		// Checking for the element 9
		System.out.println("Does the stack contains '9'? " + STACK.search(9));
		// Checking for the element 10
		System.out.println("Does the stack contains '10'? " + STACK.search(10));
		// Checking for the element 11
		System.out.println("Does the stack contains '11'? " + STACK.search(11));
	}
}
