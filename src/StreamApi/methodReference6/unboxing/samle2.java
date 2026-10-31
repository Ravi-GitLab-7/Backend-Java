package StreamApi.methodReference6.unboxing;

import java.util.stream.Stream;

public class samle2 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9); // basically intStream is storing the integer values
        Integer reduce = integerStream.reduce(0,(a,b)->a+b);
        System.out.println(reduce);
    }
}
