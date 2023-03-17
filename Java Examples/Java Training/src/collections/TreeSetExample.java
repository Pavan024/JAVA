package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        // Insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        System.out.println("SortedSet: " + numbers);

        // Access the element
        int firstNumber = numbers.first();
        System.out.println("First Number: " + firstNumber);

        int lastNumber = numbers.last();
        System.out.println("Last Number: " + lastNumber);

        // Remove elements
        boolean result = numbers.remove(2);
        System.out.println("Is the number 2 removed? " + result);

        //subset elements
        System.out.println("subSet : "+numbers.subSet(2, 4));

        //tail element
        System.out.println("Tail element : "+numbers.tailSet(3));

        // Using headSet() with default boolean value
        System.out.println("Using headSet : " + numbers.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("Using headSet : " + numbers.headSet(3, true));

        // Using tailSet() with default boolean value
        System.out.println("Using tailSet : " + numbers.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet : " + numbers.tailSet(4, false));

        // Using subSet() with default boolean value
        System.out.println("Using subSet : " + numbers.subSet(4, 6));

        // Using subSet() with specified boolean value
        System.out.println("Using subSet : " + numbers.subSet(4, false, 6, true));

        // Using higher()
        System.out.println("Using higher: " + numbers.higher(4));

        // Using lower()
        System.out.println("Using lower: " + numbers.lower(4));

        // Using ceiling()
        System.out.println("Using ceiling: " + numbers.ceiling(4));

        // Using floor()
        System.out.println("Using floor: " + numbers.floor(3));


    }
}
