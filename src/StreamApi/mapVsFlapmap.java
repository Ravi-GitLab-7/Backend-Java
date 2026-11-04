package StreamApi;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapVsFlapmap {
    public static void main(String[] args) {
        // by using map
        //
        // input : 1,2,3
        // output : "value one is 1", "value one is 2", "value one is 3"

//        List<Integer> integerList =List.of(1,2,3);
//        Stream<Integer> streamOfInteger =integerList.stream();
//        Stream<String> streamOfString =streamOfInteger.map(new Function<Integer,String>() {
//            @Override
//            public String apply(Integer intValue) {
//                return "value is: "+intValue;
//            }
//        });
//        List<String> listOfString = streamOfString.collect(Collectors.toList());
//        System.out.println(listOfString);
        // by lamda+stream
//        List<Integer> integerList =List.of(1,2,3,4,5,6,7,8,9);
//        List<String> listOfString =integerList
//                .stream()
//                .map(intValue ->"intvalue is: "+intValue )
//                .collect(Collectors.toList());
//        System.out.println(listOfString);
        //
        //input : ["Ravi Raj","Hello world","spring Boot"]
        //output : ["Ravi ,Raj,Hello world,spring Boot"]
//        List<String> listOfString =List.of("Ravi Raj","Hello world","spring Boot")
//                .stream()
//                .map(str ->str.replace(" ",""))
//                .collect(Collectors.toList());
//        System.out.println(listOfString);

        // by usig flatmap
        //    <R> Stream<R> flatMap(Function<T> ,  Stream<R> mapper);
        List<String> listOfStrings = List.of("hello world", "selenium express", "hi baby");
        List<String> streamOfStrings = listOfStrings.stream()
                                                       .flatMap(str ->Arrays.stream(str.split(""))) // one method give many out[ut their also flattining output
                                                        .collect(Collectors.toList());
        System.out.println(streamOfStrings);
    }
}
