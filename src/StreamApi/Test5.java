package StreamApi;

import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static java.util.Collections.reverseOrder;

public class Test5 {
    public static void main(String[] args) {
//        // setting up infinite stream using iterate
//
//        Stream.iterate(0, new UnaryOperator<Integer>() { // seed denote countinous number unary opr that is the like int operator it have apply method that is the override and it return their increrding value
//                                        @Override
//                                        public Integer apply(Integer integer) {  // here when i take int then both side write int when i take str then both side write str
//                                            return integer+1;
//                                        }
//                                    })
////                .filter(integer -> integer <20)
//                .limit(20) // use it intead of filter  // limit is short cuirting data and terminate completely
////                .sorted()  // it will grqave all the element and grave tha all data and get error like 	at java.base/java.util.stream.SortedOps$RefSortingSink.accept(SortedOps.java:409)
//
//                .forEach(Integer -> System.out.println(Integer));


//        // now we have to sorted  in reverseOrder steam with the help of passing  comparator in sorted
//        Stream.of(1,54,3,6,8,2,65,9)
//                .sorted(Comparator.reverseOrder())
//                .forEach(num -> System.out.println(num));


//        // run debug and also pridict the output
//        Stream.iterate(0,i -> i+1)
//                .limit(20)
//                .sorted(Comparator.reverseOrder())
//                .forEach(num -> System.out.println(num));


        // if i get square of given number then we use takeWhile() method
//        Stream.of(1,2,3,4,5,6,7,8,9,10)
////                .filter(integer -> { // this is the non terminating short circuit instrad of this use takeWhile method print all of at the end
//                .takeWhile(integer -> { // short-circuiting stateful intermediate operation  it terminate when condition is false
//                            System.out.println("filter :applying filter on the integer :"+ integer);
//                           return integer <8;
//                        })
//
//                .map(num -> {
//                    System.out.println("map :applying map on the integer :"+ num);
//                    return num*num;
//                })
//                .forEach(num -> System.out.println(num));
//            // another example of  that is new method  takeWhile() method
//            Stream.of("Rai", "Rahul","sonu","monu")
//                    .takeWhile(str -> str.length() >4)
//                    .forEach(str -> System.out.println(str));



          // skip string
        Stream.of("Rai", "Rahul","sonu","monu","Rahul","sonu")
                .skip(2)  // skip 2 string then print Rahul,monu,Rahul,sonu 
                .distinct()   // remove duplicate string   this stateful operation
                .forEach(str -> System.out.println(str));
    }
}
