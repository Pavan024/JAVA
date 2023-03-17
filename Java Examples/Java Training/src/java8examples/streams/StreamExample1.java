package java8examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Manisai", Gender.MALE));
        people.add(new Person("Kalpana", Gender.FEMALE));
        people.add(new Person("Anjali", Gender.FEMALE));
        people.add(new Person("Saipavan", Gender.MALE));

        //using the map method with toSet
        people.stream().map(person -> person.getGender()).collect(Collectors.toSet()).forEach(System.out::println);

        //using the filter method with toList
        List<Person> males = people.stream().filter(person -> person.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        males.forEach(System.out::println);

        //using the allMatch method
        boolean b = people.stream().allMatch(person -> person.getGender().equals(Gender.FEMALE));
        System.out.println("Using the allMatch method : "+b);

        //using the anyMatch method
        boolean b1 = people.stream().anyMatch(person -> person.getGender().equals(Gender.FEMALE));
        System.out.println("Using the anyMatch Method : "+b1);

        //using the noneMatch method
        boolean b2 = people.stream().noneMatch(person -> person.getGender().equals(Gender.PREFER_NOT_TO_SAY));
        System.out.println("Using the noneMatch Method : "+b2);

    }

}
