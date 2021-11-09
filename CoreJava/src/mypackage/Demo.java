package mypackage;

class MyOuter {
	static int num1 = 40;
	int num2 = 30;

	public static void getNum1() {
		System.out.println("Outer Method1:" + num1);
		System.out.println(new MyOuter().num2);
	}

	public void getNum2() {
		System.out.println("Outer Method2:" + num2);
		System.out.println(num1);

//		MyInner inner = new MyInner();
//		System.out.println("Local Inner Class Static Variable:" + MyInner.x);
//		System.out.println("Local Inner Class Instance Variable:" + inner.y);
//		inner.getX();
//		inner.getY();
	}

	class MyInner {
		static final int x = 10;
		int y = 20;

		public final void getX() {
			System.out.println("Local Inner Method1:" + x);
		}

		public void getY() {
			System.out.println("Local Inner Method2:" + y);
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		MyOuter outer = new MyOuter();
		MyOuter.MyInner inner = outer.new MyInner();
		System.out.println("Static Outer Variable:" + MyOuter.num1);
		System.out.println("Instance Outer Variable:" + outer.num2);
		MyOuter.getNum1();
		outer.getNum2();
		System.out.println(MyOuter.MyInner.x);
		System.out.println(inner.y);
		inner.getX();
		inner.getY();
	}

}
