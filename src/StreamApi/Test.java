package StreamApi;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello Stream";
            }
        };
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println("Printing the string: " + str);
            }

        };
        Stream<String> streamOfStrings = Stream.generate(supplier);  // it generate stream of stream in pipeline
        streamOfStrings.forEach(consumer); // and foreach method it consume each string and accept string
    }

}
