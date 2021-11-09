package streamApi;

import java.util.ArrayList;
import java.util.List;

class Products {
	int id;
	String name;
	float price;

	public Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Reduce {
	public static void main(String[] args) {
		List<Products> productsList = new ArrayList<Products>();

		productsList.add(new Products(1, "HP Laptop", 25000f));
		productsList.add(new Products(2, "Dell Laptop", 30000f));
		productsList.add(new Products(3, "Lenevo Laptop", 28000f));
		productsList.add(new Products(4, "Sony Laptop", 28000f));
		productsList.add(new Products(5, "Apple Laptop", 90000f));

		Float totalPrice = productsList.stream()
										.map(product -> product.price)
										.reduce(0.0f,(sum, price) -> sum + price);
		System.out.println(totalPrice);

	}
}