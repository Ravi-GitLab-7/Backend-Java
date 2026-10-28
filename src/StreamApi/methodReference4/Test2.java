package StreamApi.methodReference4;

import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        Function<String,String> toUppercase = String::toUpperCase;
        System.out.println(toUppercase.apply("Ravi Raj"));
    }
}
