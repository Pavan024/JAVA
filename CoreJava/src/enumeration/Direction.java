package enumeration;

public enum Direction {
	NORTH(1) {
		@Override
		public void test() {
			System.out.println("overridden method in north");

		}
	},
	SOUTH(2) {
		@Override
		public void test() {
			System.out.println("overridden method in south");

		}
	},
	EAST(3) {
		@Override
		public void test() {
			System.out.println("overridden method in east");

		}
	},
	WEST(4) {
		@Override
		public void test() {
			System.out.println("overridden method in west");

		}
	};

	private int value;

	Direction(int value) {// correct
		this.value = value;
	}

	abstract public void test();

	public static void main(String[] args) {
		for (Direction d : Direction.values()) {
			System.out.println(d + " " + d.value);
			d.test();
		}
	}
}
