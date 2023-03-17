package streams;

import java.util.function.Consumer;

public class ConsumerInterface {

	
	public static void main(String[] args)
	{
		Consumer<String> a =aa->System.out.println(aa);
		
		a.accept("[]iog");
	}
}
