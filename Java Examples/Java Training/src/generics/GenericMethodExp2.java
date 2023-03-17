package generics;

public class GenericMethodExp2 {
    public static void main(String[] args) {
        Employee111 employee1 = new Employee111(1, "Manisai", "Devasani", "manisai@gmail.com", "Hyderbad", 60000);

        Employee111 empArry[] = new Employee111[1];
        empArry[0] = employee1;
        display(empArry);

        Integer[] intArray = {10, 20, 30, 40, 50};
        display(intArray);


    }

    //Generic method
    private static <E> void display(E[] elements) {
        for (E e : elements) {
            System.out.println(e);
        }

    }
}
