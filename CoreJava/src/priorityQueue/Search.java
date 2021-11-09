package priorityQueue;

import java.util.PriorityQueue;

public class Search {
	public static void main(String args[]) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(10);
		queue.add(15);
		queue.add(30);
		queue.add(20);
		queue.add(5);

		System.out.println("PriorityQueue: " + queue);

		// Check for '15' in the queue
		System.out.println("Does the Queue contains '15'? " + queue.contains(15));

		// Check for '2' in the queue
		System.out.println("Does the Queue contains '2'? " + queue.contains(2));

		// Check if the Queue contains '10'
		System.out.println("Does the Queue contains '10'? " + queue.contains(10));
	}
}
