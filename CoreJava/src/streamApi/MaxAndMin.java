package streamApi;

import java.util.ArrayList;
import java.util.List;

class Item {
	int id;
	String name;
	float price;

	public Item(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class MaxAndMin {
	public static void main(String[] args) {
		List<Item> ItemsList = new ArrayList<Item>();

		ItemsList.add(new Item(1, "HP Laptop", 25000f));
		ItemsList.add(new Item(2, "Dell Laptop", 30000f));
		ItemsList.add(new Item(3, "Lenevo Laptop", 28000f));

		
		// max() method to get max Item price
		Item itemA = ItemsList.stream()
				.max((Item1, Item2) -> Item1.price > Item2.price ? 1 : -1)
				.get();
		System.out.println(itemA.price);
		
		// min() method to get min Item price
		Item itemB = ItemsList.stream()
				.min((Item1, Item2) -> Item1.price > Item2.price ? 1 : -1)
				.get();
		System.out.println(itemB.price);

	}
}