package enumeration;

enum Season {
	SUMMER, RAINY, WINTER, SPRING;
}

public class EnumExample {

	public static void main(String[] args) {
		Season[] s = Season.values();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println(Season.RAINY.ordinal());
	}

}
