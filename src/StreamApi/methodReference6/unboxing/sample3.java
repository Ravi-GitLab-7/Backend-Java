package StreamApi.methodReference6.unboxing;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sample3 {
    public static void main(String[] args) {
        // this is autounboxing here integer stream convert into intstream
        Stream.of(1, 2, 3, 4, 5)
        .mapToInt(Integer::intValue)
        .sum();
    }
}
