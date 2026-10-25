package StreamApi;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = new Consumer<>(){

            @Override
            public void accept(Integer integerObj) {
                System.out.println(integerObj);
            }
        };
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
        integerStream.forEach(consumer);
    }
}
