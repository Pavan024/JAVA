package java8examples.functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Customer customer = new Customer("Manisai", "9876345623");
        System.out.println("By using the java method : ");
        greetConsumer(customer);
        System.out.println("By using the java8 Consumer : ");
        greetCustomerByConsumer.accept(customer);

        System.out.println("By using the java8 BiConsumer : ");
        greetCustomerByBiConsumer.accept(customer, true);
        greetCustomerByBiConsumer.accept(customer, false);



    }

    public static void greetConsumer(Customer customer) {
        System.out.println("Hello "+customer.getName()+" thanks for registering "+customer.getPhoneNumber());
    }

    //by using the Customer
    static Consumer<Customer> greetCustomerByConsumer = customer -> {
        System.out.println("Hello "+customer.getName()+" thanks for registering "+customer.getPhoneNumber());
    };

    //by using the BiCustomer
    static BiConsumer<Customer, Boolean> greetCustomerByBiConsumer = (customer, showPhone) -> {
        System.out.println("Hello "+customer.getName()+" thanks for registering "+(showPhone ? customer.getPhoneNumber() : "******"));
    };
}
