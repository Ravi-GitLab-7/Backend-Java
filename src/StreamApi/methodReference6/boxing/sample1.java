package StreamApi.methodReference6.boxing;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class sample1 {
    public static void main(String[] args) {
//        IntStream intStream = IntStream.rangeClosed(0, 10); // 0 to 10
////        IntStream intStream = IntStream.range(0, 10);  // 0 to 9
//        Stream<Integer> integerStream = intStream.boxed();
//        integerStream.forEach(System.out::println);


        // another example
        IntStream.rangeClosed(0, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(IntStream.class);

        Integer[] integersArray = new Integer[]{1, 4, 5, 7, 8, 9, 3, 2};
        Arrays.stream(integersArray) // here it return integer
                .forEach(System.out::println);
    }
}
