package priorityQueue;

import java.util.PriorityQueue;

public class Remove {

	public static void main(String args[]) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(9);
		pq.offer(6);
		pq.offer(5);
		pq.offer(1);
		pq.add(8);
		pq.add(3);

		System.out.println("Initial PriorityQueue: " + pq);

		pq.remove(9);
		pq.remove(1);
		pq.remove(5);
		pq.poll();
		pq.poll();
		System.out.println("PriorityQueue after removing " + "elements: " + pq);
	}
}
