package StreamApi.methodReference6;

import java.util.stream.LongStream;

public class parallelStreamWhenApply {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        long sum = LongStream.rangeClosed(0,1000000000).sum();
//        System.out.println("sequential: time is taken for sum of all elements: "+(System.currentTimeMillis()-startTime));
//        System.out.println(sum);
//
//        long startTime1 = System.currentTimeMillis();
//        long sum1 = LongStream.rangeClosed(0,1000000000).parallel().sum();
//        System.out.println("parallel: time is taken for sum of all elements: "+(System.currentTimeMillis()-startTime1));
//        System.out.println(sum1);
//
        // now apply reduce method instead of sum and this best scenario for usw with paralle stream

            long startTime = System.currentTimeMillis();
            long sum = LongStream.rangeClosed(0, 10).reduce(0, (a, b) -> a + b);
            System.out.println("sequential: time is taken for sum of all elements: " + (System.currentTimeMillis() - startTime));
            System.out.println(sum);

            long startTime1 = System.currentTimeMillis();
            long sum1 = LongStream.rangeClosed(0, 10).parallel().reduce(0, (a, b) -> a + b);
            System.out.println("parallel: time is taken for sum of all elements: " + (System.currentTimeMillis() - startTime1));
            System.out.println(sum1);

    }
}
