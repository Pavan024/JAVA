package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Reverse {

	public static void main(String args[]) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(5);

		// Printing the top element of PriorityQueue
		System.out.println(pq.peek());

		// removing the top element it from the PriorityQueue container
		pq.poll();

		// Printing the top element again
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq.peek());
	}
}
