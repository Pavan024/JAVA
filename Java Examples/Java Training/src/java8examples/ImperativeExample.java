package java8examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Manisai", Gender.MALE));
        people.add(new Person("Anjali", Gender.FEMALE));
        people.add(new Person("Saipavan", Gender.MALE));


        // Imperative Approach
        List<Person> females = new ArrayList<>();

        for(Person person: people) {
            if (Gender.FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for(Person female: females) {
            System.out.println("By using Imperative approach : "+female);
        }

        //Declarative Approach
        System.out.println("By using Declarative approach : ");
        List<Person> males = people.stream().filter(person->person.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        males.forEach(System.out::println);

    }
}
