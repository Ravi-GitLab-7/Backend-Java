package StreamApi;

import java.util.stream.Stream;

public class practiceCreteStreamOfNames {
    public static void main(String[] args) {
        Stream.of("Ravi","Amit","Rohit")
                .forEach(str -> System.out.println("Printing Stream: "+str));
    }
}
