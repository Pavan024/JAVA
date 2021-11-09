package enumeration;

public enum Weekdays {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	public static void main(String... ags) {
		for (Weekdays w : Weekdays.values()) {
			System.out.println(w);
		}
		
	}

}
