package StreamApi.methodReference6;

import java.util.ArrayList;
import java.util.List;

public class parallelStream3 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.addAll(List.of(1,5,8,90,45,23,56,8,98,34,12,54));
        listOfInteger.parallelStream()
                .sorted()
                .forEach(System.out::println);
//               .forEachOrder(System.out::println);


    }
}
