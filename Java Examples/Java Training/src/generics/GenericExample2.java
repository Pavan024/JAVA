package generics;

import java.util.ArrayList;
import generics.MyCustomList;

class MyCustomList1<T> {
	ArrayList<T> list = new ArrayList<>();

	public T get(int index) {
		return list.get(index);
	}

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return "MyCustomList{" + "list=" + list + '}';
	}
}

public class GenericExample2 {
	public static void main(String[] args) {
		MyCustomList1<String> list = new MyCustomList1<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		System.out.println(list);
		System.out.println("element at index 0 is " + list.get(0));
		MyCustomList1<Integer> list2 = new MyCustomList1<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(10));
		System.out.println(list2);
		System.out.println("number at index 1 is " + list2.get(1));
	}
}