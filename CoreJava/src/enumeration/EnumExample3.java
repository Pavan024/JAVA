package enumeration;

enum Vehicles {
	// Declaring the constants of the enum
	ACTIVA125, ACTIVA5G, ACCESS125, VESPA, TVSJUPITER;

	// static variable of the enum
	static int i;
	static {
		i = 100;
	}

	// static method of the enum
	public static void enumMethod() {
		System.out.println("This is a static method of enumeration");
	}
}

public class EnumExample3 {
	public static void main(String args[]) {

		for (Vehicles veh : Vehicles.values()) {
			System.out.println(veh);
		}
		System.out.println("Value of the static variable: " + Vehicles.i);
		Vehicles.enumMethod();
	}
}
