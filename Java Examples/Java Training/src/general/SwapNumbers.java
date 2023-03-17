package general;

public class SwapNumbers {

    public static void main(String[] args) {

        int first = 12, second = 24;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
