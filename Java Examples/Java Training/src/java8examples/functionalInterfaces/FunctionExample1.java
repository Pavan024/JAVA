package java8examples.functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample1 {
    public static void main(String[] args) {
        int num = incrementByOne(1);
        System.out.println("By using the java method : "+num);
        System.out.println(" By using the Function : "+incrementByOneFunction.apply(1));
        System.out.println("By using the Function : "+multiplyBy10Function.apply(1));

        Function<Integer, Integer> addANDMultiply =  incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println("By using the andThen method : "+addANDMultiply.apply(4));

        System.out.println("By using the BiFunction : "+incrementAndMultiplyBiFunction.apply(1, 10));
    }

    //Basic java method implementation
    static int incrementByOne(int number) {
        return number + 1;
    }

    //using the Function
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementAndMultiply(int num, int number) {
        return (num + 1) * number;
    }

    //using the BiFunction
    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFunction = (numberToIncrement, numberToMultiply) -> (numberToIncrement + 1) * numberToMultiply;
}
