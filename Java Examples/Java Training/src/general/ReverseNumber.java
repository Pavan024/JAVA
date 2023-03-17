package general;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 101;
		int reverse = 0, remainder = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
		if (num == reverse) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

}
