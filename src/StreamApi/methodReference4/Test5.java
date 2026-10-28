package StreamApi.methodReference4;

import java.util.function.BiFunction;

public class Test5 {
    public static void main(String[] args) {
        Sample sample = new Sample();

        // Reference the sum method on this particular Sample instance.
        BiFunction<Integer, Integer, Integer> addition = sample::sum;

        int result = addition.apply(10, 20);
        System.out.println("Sum: " + result);
    }
}
