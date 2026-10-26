
package StreamApi;

import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {

        // Sorting of integers
        // Stream.of(1, 5, 2, 8, 3, 9, 3, 10, 7)
        //        .sorted()
        //        .forEach(num -> System.out.println(num));

        // Sorting of strings
        Stream.of("Ravi", "Amit", "Rohit")
                .filter(nameString -> {
                    System.out.println(
                            "Filter applying on name: " + nameString
                    );                    return nameString.length() > 2;
                })
                // first filter print all string name abd then after it success then sorted the string name and then again peek and athen print the string name with sorted
                .sorted()
                .peek(name -> System.out.println(
                        "Sorting name is: " + name
                ))
                .forEach(str -> System.out.println(str));

    }
}
