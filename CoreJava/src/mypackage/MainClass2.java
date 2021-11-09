package mypackage;

class Sample {
	static int num = 10;// static but not constant variable
}

public class MainClass2 {
	int y;

	class Inner extends Sample {
		int x = Sample.num;// upon inheritance we can access static variable which are not constant

		public void test() {
			System.out.println(y);
		}
	}

	public static void main(String[] args) {

		System.out.println(new MainClass2().new Inner().x);// prints 10
	}

}
