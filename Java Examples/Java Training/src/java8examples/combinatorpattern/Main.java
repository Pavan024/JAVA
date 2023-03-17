package java8examples.combinatorpattern;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Pavan Kumar", "pavan.kumar@gmail.com", "+919898989898",
				LocalDate.of(1998, 8, 26));
		
		System.out.println(new CustomerValidatorService().isValid(customer));
	}
}
