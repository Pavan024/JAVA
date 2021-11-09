package priorityQueue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Sort {
	public static void main(String[] args) {
		Comparator<String> cmp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		PriorityQueue<String> queue = new PriorityQueue<String>(cmp);

		queue.add("A");
		queue.add("K");
		queue.add("P");
		queue.add("O");
		queue.add("W");
		queue.add("B");

		System.out.println("The elements with the highest priority element at front of queue" + "order:");
		while (!queue.isEmpty()) {
			System.out.print(" " + queue.poll());
		}
	}
}
