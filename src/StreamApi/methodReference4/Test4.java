package StreamApi.methodReference4;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        //use add method that is instance method
        BiFunction<ArrayList<Integer>,Integer,Boolean> biConsumer = ArrayList::add;
        Boolean isAdded= biConsumer.apply(al, 10);
        System.out.println(isAdded);
        System.out.println(al);
    }
}
