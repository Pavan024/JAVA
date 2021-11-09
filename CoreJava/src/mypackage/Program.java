package mypackage;

public class Program

{
	public static void main(String[] args) {
		short shortInt = 30000;
		int shortIntAsInt = shortInt; // value is intact, no loss of magintude or precision
		System.out.println(shortIntAsInt); // 30000

		int big = 1234567890;
		float bigAsFloat = big;// no loss in magnitude, but loss in precision
		System.out.println(bigAsFloat);// 1234567940
	}
}