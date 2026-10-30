package StreamApi.methodReference6;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sample1 {
    public static void main(String[] args) {
//        // autoboxing concept
//        int i = 10;
//        Integer integer = 10;
//        System.out.println(integer); // here internally work Integer.valueOf(i);     compiler convert it into the integer object
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(10);  // it will internally call Integer.valueOf(10); this is calso called autoboxing
//        list.get(0);
//
//        int j = list.get(0).intValue(); // this is called unboxing by mannually converting it into integer int
//        System.out.println(j);
//
//
//        // hwew overloaded by compiler again and again load integer bu in intStream we have to not any overloadede
//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5); // instead ofthis method we can use IntStream this are given in below
//        integerStream.forEach(intg ->{
//            System.out.println(intg );
//        });
//        // now we lern about intStrem
//        IntStream intStream = IntStream.of(1, 2, 3, 4, 5); // primitive int value
//        intStream.forEach(System.out::println);
//
//        // why we use intStrem because   it is more efficient than Stream<Integer> because it is not autoboxing and unboxing
//        int i1 = 10; // it take 4 bytes memory
//        Integer i2 = Integer.valueOf(10); // bit it takes 20 bytes memory
//
//        // and also
//        Stream<Integer> intStream1 = Stream.of(1, 2, 3, 4, 5);  //here internally combined with integer and then it convert int intStream1 interface
//        //  thats why we dont take this as compare to intStrem method
//
//            // this also called typesz of intStream doubleStream and also have longStream
//        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
//        doubleStream.forEach(System.out::println);
//
//        // advantages of intStream
//        IntStream intStream2 = IntStream.of(1,2,3,4,5,6,8,9);
//            // if we go for sum then sum is present the internally that's we can call this is only present in intStream method

//        intStream2.sum();
//        OptionalInt min = intStream2.min();
//        if(min.isPresent()){
//            System.out.println(min.getAsInt());
//        }
//        //for maximum
//        OptionalInt max = intStream2.max();
//            if(max.isPresent()){
//                System.out.println(max.getAsInt());
//            }




        // reduce  method
//        // how this internally work
//        1, 2, 3, 4, 5, 6, 7, 8, 9
//        3, 3, 4, 5, 6, 7, 8, 9
//        6, 4, 5, 6, 7, 8, 9
//        10,5, 6, 7, 8, 9
//        15,6, 7, 8, 9
//        21,7, 8, 9
//        28,8, 9
//        36,9
//        45
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> result = integerStream.reduce(Integer::sum);// give logic for Bifunction
//        Optional<Integer> result = integerStream.reduce((a,b)->a+b); // these are aslo correct
//        // i do also by ths types
//        Integer reduce = integerStream.reduce(0,(a,b)->a*b);
//        System.out.println(reduce);

        if(result.isPresent()){
            System.out.println(result.get());
        }
    }
}
