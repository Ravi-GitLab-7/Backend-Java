package StreamApi.methodReference4;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test3 {
    public static void main(String[] args) {
        //    public static final PrintStream out = null; use this as a static method  println is not return any thing
        BiConsumer<PrintStream,String>consumer = PrintStream::println; // print ln has only one parameter so that we can use here consumer
        consumer.accept(new PrintStream(System.out), "Ravi Raj .....");
    }
}
