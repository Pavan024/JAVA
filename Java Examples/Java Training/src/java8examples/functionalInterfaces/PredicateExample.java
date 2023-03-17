package java8examples.functionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        System.out.println("By using the normal method : ");
        System.out.println(isPhoneNumberValid("911234567845"));

        System.out.println("By using the predicate method : ");
        System.out.println(isPhoneNumberValidByPredicate.test("912345654"));
        System.out.println("is phone Number contains 3 number : "+isPhoneNumberValidByPredicate.and(containsNumber3).test("919876543456"));
        System.out.println("is phone Number contains 2 number : "+isPhoneNumberContains2ByBiPredicate.test("912345987645", "3"));


    }

    public static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("91") && phoneNumber.length() == 12;
    }

    static Predicate<String> isPhoneNumberValidByPredicate = phoneNumber -> phoneNumber.startsWith("91") && phoneNumber.length() == 12;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static BiPredicate<String, String> isPhoneNumberContains2ByBiPredicate = (phoneNumber, number) ->phoneNumber.contains(number);

}
