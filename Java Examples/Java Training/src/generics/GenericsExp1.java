package generics;

public class GenericsExp1 {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>(); //parameterized type
        list.addElement("Element 1");
        list.addElement("Element 2");
        System.out.println(list);
        System.out.println("element at index 0 is " + list.get(0));

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(5);
        list2.addElement(10);
//        list2.addElement("String1"); //type-safety
        System.out.println(list2);
        list2.removeElement(10);
        System.out.println("number at index 0 is " + list2.get(0));

        MyCustomList<Employee111> list3 = new MyCustomList<Employee111>();
        list3.addElement(new Employee111(1, "Manisai", "Devasani", "manisai@gmail.com", "Hyderbad", 60000));
        System.out.println("List 3 : "+list3);


    }
}
