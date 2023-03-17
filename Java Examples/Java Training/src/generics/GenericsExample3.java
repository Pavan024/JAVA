package generics;
import java.util.LinkedList;

interface GenericInterface<T1> { 
	public void addElement1(T1 element); 
	public void addElement2(T1 element); 
}

class ImplementsInterface<T1> implements GenericInterface<String> {
	LinkedList<T1> list = new LinkedList<T1>();

	@Override
	public void addElement1(String element) {
		list.add((T1) "element1");
	}

	@Override
	public void addElement2(String element) {
		list.add((T1) "element2");
	}

	@Override
	public String toString() {
		return "ImplementsInterface{" + "list=" + list + '}';
	}

	public T1 get(int index) {
		return list.get(index);
	}
}

public class GenericsExample3 {
	public static void main(String[] args) {
		ImplementsInterface<String> list = new ImplementsInterface<>();
		list.addElement1("Element 1");
		list.addElement2("Element 2");
		System.out.println(list);
		System.out.println("element at index 0 is " + list.get(0));
	}
}