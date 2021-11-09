package streamApi;

import java.util.ArrayList;
import java.util.List;

class Items {
	int id;
	String name;
	float price;

	public Items(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Count {
	public static void main(String[] args) {
		List<Items> ItemsList = new ArrayList<Items>();

		ItemsList.add(new Items(1, "HP Laptop", 25000f));
		ItemsList.add(new Items(2, "Dell Laptop", 30000f));
		ItemsList.add(new Items(3, "Lenevo Laptop", 28000f));
		ItemsList.add(new Items(4, "Sony Laptop", 28000f));
		ItemsList.add(new Items(5, "Apple Laptop", 90000f));
		
		// count number of Items based on the filter
		long count = ItemsList.stream()
				.filter(Items -> Items.price < 30000)
				.count();
		System.out.println(count);
	}
}