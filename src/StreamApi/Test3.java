package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        Student amit = new Student(1,"Amit",27,123465343);
        Student ravi = new Student(2,"Ravi",22,234544654);
        Student rohit = new Student(3,"Rohit",19,34564536);

        List<Student> studentListlist = Arrays.asList(amit,ravi,rohit);
//
//        Stream<Student> stream = studentListlist.stream();
//        stream.forEach(System.out::println);
        // instend use lamda

        // lamda expression
        studentListlist.stream ()
          .forEach(Student-> System.out.println(Student));
        //method reference
//        studentListlist.stream ()
//                .forEach(System.out::println);

        // boolean axpresssion that is called filter method that is filtering the integer

        Integer[] numbers = {1, 3, 4, 5, 6, 7, 8, 9, 0};
        Stream<Integer> streamOfInteger = Arrays.stream(numbers);


//        Stream<Integer> filterIntegerStream = streamOfInteger.filter(new Predicate<Integer>() {
//
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 5;
//            }
//        });
        streamOfInteger
                .peek(num -> System.out.println("Processing thenumber " +num))
                .filter( integer -> {
                            System.out.println("Appling filter conditio on no" +integer);
                            return  integer > 5;}
                )
                .forEach(num -> {
                    System.out.println("forEach : printing the number");
                    System.out.println(num);
                });
//        filterIntegerStream.forEach( System.out::println); // same output use method reference
    }
}
