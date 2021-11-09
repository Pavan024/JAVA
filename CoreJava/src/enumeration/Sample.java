package enumeration;

public class Sample {
	// MEMBER INNER CLASS
	/*
	 * class Inner { // The member enum Directions must be defined inside a static
	 * member type enum Directions// ERROR { NORTH, SOUTH, EAST, WEST; } }
	 */

	public static void main(String[] args) {
		// LOCAL INNER CLASS
		/*
		 * class Inner1 { // The member enum Directions can only be defined inside a
		 * top-level class or // interface or in a static context enum Season// ERROR {
		 * SUMMER, WINTER, SPRING, RAINY; } }
		 */

	}

	// STATIC NESTED CLASS
	static class Inner2 {
		enum Weekdays// CORRECT
		{
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		}
	}

}
