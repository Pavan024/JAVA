package enumeration;

import java.util.Scanner;

enum Scoters {
	// Constants with values
	ACTIVA125(80000), ACTIVA5G(70000), ACCESS125(75000), VESPA(90000), TVSJUPITER(75000);

	// Instance variable
	private int price;

	// Constructor to initialize the instance variable
	Scoters(int price) {
		this.price = price;
	}

	// instance method to display the price
	public void displayPrice(int model) {
		Scoters constants[] = Scoters.values();
		System.out.println("Price of: " + constants[model] + " is " + constants[model].price);
	}
}

public class EnumExample4 {
	public static void main(String args[]) {
		Scoters constants[] = Scoters.values();
		System.out.println("Value of constants: ");
		for (Scoters d : constants) {
			System.out.println(d.ordinal() + ": " + d);
		}
		System.out.println("Select one model: ");
		Scanner sc = new Scanner(System.in);
		int model = sc.nextInt();
		// Calling the instance method of the enum
		constants[model].displayPrice(model);
		sc.close();
	}
}