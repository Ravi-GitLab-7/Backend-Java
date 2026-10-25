package StreamApi;

import java.util.Arrays;

public class Test3Point1 {
    public static void main(String[] args) {
        Integer[] numbers ={1, 2, 3, 4, 5,6,7,8,9,10};

        Arrays.stream(numbers)
        .filter(num -> num > 6)
        .forEach(num -> System.out.println(num))
        .map(num -> System.out.println(num));
    }
}
