package java8examples.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println("By using the supplier function : "+getUsers.get());

    }

    static Supplier<List<String>> getUsers = () -> {
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("user2");
        return users;
    };
}
