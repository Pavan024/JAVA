package com.generics;

public class Bottle<T> {
	private T item;

	public Bottle() {}
	
	public Bottle(T item) {
		this.item=item;
	}
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	public static <T extends OralMedicine> String doSomething(T item) {
		return item.toString();
	}
}
