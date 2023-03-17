package java8examples.optionals;

import java.util.Optional;

public class Mainclass {
	public static void main(String[] args) {
		Object value = Optional.ofNullable(null).orElseGet(() -> "default value");

		Object value1 = Optional.ofNullable("Hello").orElseGet(() -> "default value");
		System.out.println("value : " + value);
		System.out.println("value1 : " + value1);
		
		Object value2 = Optional.ofNullable("Hello").orElseThrow();
		System.out.println("value2 : " + value2);
//		Exception in thread "main" java.util.NoSuchElementException: No value present
//		Object value3 = Optional.ofNullable(null).orElseThrow();
		
		Object value4 = Optional.ofNullable(null).orElse(null);
		Object value5 = Optional.ofNullable("Hello").orElse(null);
		System.out.println("value4 : " + value4);
		System.out.println("value5 : " + value5);
		
		Object value7 = Optional.ofNullable("Hi Pavan").orElseThrow(null);
		System.out.println("value7: " + value7);
//		throws an exception produced by the exception supplying function.
//		Object value6 = Optional.ofNullable(null).orElseThrow(() -> new IllegalStateException("exception"));
//		System.out.println("value6 : " + value6);
		
		Optional.ofNullable("Hi Mani").ifPresent(
				greet -> System.out.println(greet));
		Optional.ofNullable(null).ifPresent(
				greet -> System.out.println(greet));

		Optional.ofNullable(null).ifPresentOrElse(
				greet -> System.out.println(greet), 
				() -> System.out.println("connot greet")
				);
		Optional.ofNullable("Hello world").ifPresentOrElse(
				greet -> System.out.println(greet), 
				() -> System.out.println("connot greet")
				);
		
		boolean bool = Optional.ofNullable(null).isEmpty();
		System.out.println("bool : " + bool);
		boolean bool1 = Optional.ofNullable("Good Morning").isPresent();
		System.out.println("bool1 : " + bool1);
		
	}
}
