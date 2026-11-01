package StreamApi.methodReference6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.List;

public class parallelStreamSafety {
    public static void main(String[] args) {
//

//        // now by iterator method
//        Stream.iterate(0,no ->no<=10,no -> no+1)  // iterate will give infinite stream so give condition like Predicate
//        .forEach(no -> System.out.println(no));


        List<Integer> listOfInteger = Collections.synchronizedList(new ArrayList<>());

        for (int i = 0; i < 5; i++) {
            listOfInteger.clear(); // iterate will give infinite stream so give condition like Predicate
            Stream.iterate(0, no -> no < 20, no -> no + 1).parallel().forEach(no -> listOfInteger.add(no));
//            Stream.iterate(1, no -> no <= 20, no -> no + 1).parallel().forEachOrdered(no -> listOfInteger.add(no)); // this is also use foir same as givenin the above
            System.out.println(listOfInteger);
            System.out.println("Size: " + listOfInteger.size());
        }





    }
}
