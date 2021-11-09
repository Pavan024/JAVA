package generic;

class Base<T> {
	T num;

}

class Derived<T> extends Base<T> {
	public void display() {
		System.out.println(num);
	}
}

public class Generic {

	public static void main(String[] args) {
		Derived<Integer> derived = new Derived<Integer>();
		derived.num = 90;
		derived.display();

	}

}
