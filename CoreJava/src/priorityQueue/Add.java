package priorityQueue;

import java.util.PriorityQueue;

public class Add {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(9);
		pq.offer(6);
		pq.offer(5);
		pq.offer(1);
		pq.add(8);
		pq.add(3);
		System.out.println(pq);
	}
}
