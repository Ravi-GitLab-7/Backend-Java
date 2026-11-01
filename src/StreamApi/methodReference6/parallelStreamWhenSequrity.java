package StreamApi.methodReference6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class parallelStreamWhenSequrity {
    public static void main(String[] args) {
//        ArrayList<Integer> integerOFList = new ArrayList<>();
//        Stream.iterate(0, no -> no +1).parallel().limit(20).forEach(no -> integerOFList.add(no));
//        System.out.println(integerOFList);
//        System.out.println(integerOFList.size()); // in this situation give different size of each time whrnm we print

        //thread safe collection process
        // so we can apply collect
        for (int i = 0; i <= 10; i++) {
//            List<Integer> list = Stream.iterate(0, no -> no + 1).parallel().limit(20).collect(Collectors.toList());
            List<Integer> list = Stream.iterate(0, no -> no + 1)
                    .parallel()
                    .limit(20)
                    .collect(Collectors.toCollection( ArrayList::new)); // this will apply sfely  when we use Collectors.toList then it create list then add internally
            System.out.println(list);
            System.out.println(list.size());
        }
    }
}
