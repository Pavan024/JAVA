package linkedList;

import java.util.LinkedList;

public class Add {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(5, 60);
		for (Integer i : list) {
			System.out.println("Number:" + i);
		}

	}

}
