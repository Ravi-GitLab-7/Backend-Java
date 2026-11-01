package StreamApi.methodReference6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class parallelStream2 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.addAll(List.of(1, 3, 4, 6, 8, 3, 6, 8, 9, 2, 5, 8, 9));
        Stream<Integer> streamOfInteger = listOfInteger.stream()
                .parallel()
                .map(no -> no * 2)
//                        .sequential()
//                                .parallel() // till it true
                .sequential();  // give false

        streamOfInteger.forEach(System.out::println);
//        streamOfInteger.forEachOrdered(System.out::println); // it made it sequentially but stream is parallel
        System.out.println(streamOfInteger.isParallel());
    }
}
