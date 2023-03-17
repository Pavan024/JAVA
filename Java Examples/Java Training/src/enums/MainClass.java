package enums;

enum Planet {// implicitly extends java.lang.enum
	MERCURY("mercury"), 
	VENUS("venus"), 
	EARTH("earth"), 
	MARS("mars"), 
	JUPITER("jupiter"), 
	SATURN("saturn"),
	URANUS("uranus"), 
	NEPTUNE("neptune"),;

	private final String name;

	private Planet(String string) {
		this.name = string;
	}

	public String getName() {
		return name;
	}

}

public class MainClass {
	public static void main(String[] args) {
		Planet2 arry[] = Planet2.values();
		for (Planet2 planet2 : arry) {
			System.out.println(planet2 + " at index " + planet2.ordinal());
		}
		System.out.println(Planet2.valueOf("EARTH"));
		System.out.println(Planet.EARTH.getName());
	}
}